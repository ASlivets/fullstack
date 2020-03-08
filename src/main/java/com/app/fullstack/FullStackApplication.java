package com.app.fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class FullStackApplication {
    public static void main(String[] args) {
        SpringApplication.run(FullStackApplication.class, args);
    }

    @PostMapping("/handlePost")
    public ResponseEntity<TransportObject> handlePost(@RequestBody TransportObject transportObject) {
        return ResponseEntity.ok(transportObject);
    }

    @GetMapping("/handleGet")
    public ResponseEntity<TransportObject> handleGet() {
        final TransportObject transportObject = new TransportObject("Here is get");
        return ResponseEntity.ok(transportObject);
    }
}
