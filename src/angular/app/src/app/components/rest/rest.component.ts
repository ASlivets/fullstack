import {Component, OnInit} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
  })
};

@Component({
  selector: 'app-rest',
  templateUrl: './rest.component.html',
  styleUrls: ['./rest.component.css']
})
export class RestComponent implements OnInit {
  private baseUrl: string = 'http://localhost:8080';
  private postSuffix: string = 'handlePost';
  private getSuffix: string = 'handleGet';

  payloadOfPostRequest: string;
  payloadOfPostResponse: object;

  payloadOfGetResponse: object;

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
  }

  handlePost() {
    const url = `${this.baseUrl}/${this.postSuffix}`;
    const payload = {
      data: this.payloadOfPostRequest
    };

    this.http.post(url, payload, httpOptions).subscribe(res => {
      console.log("Post request payload: " + payload);
      this.payloadOfPostResponse = res;
      console.log("Post response payload: " + res);
    });
  }

  handleGet() {
    const url = `${this.baseUrl}/${this.getSuffix}`;

    this.http.get(url).subscribe(res => {
      this.payloadOfGetResponse = res;
      console.log("Get response payload: " + res);
    });
  }
}
