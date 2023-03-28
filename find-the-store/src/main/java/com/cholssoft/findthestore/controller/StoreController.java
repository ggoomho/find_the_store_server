package com.cholssoft.findthestore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {

    @GetMapping("")
    public ResponseEntity<String> testMethod() {
        return ResponseEntity.status(HttpStatus.OK).body("test");
    }
}
