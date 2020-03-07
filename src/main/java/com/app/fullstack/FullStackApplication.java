package com.app.fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FullStackApplication {
    public static void main(String[] args) {
        SpringApplication.run(FullStackApplication.class, args);
    }

    @PostMapping("/handlePost")
    public String handlePost(@RequestBody TransportObject transportObject) {
        System.out.println(transportObject);
        return "42";
    }

    @GetMapping("/handleGet")
    public String handleGet() {
        System.out.println();
        return "666";
    }
}
