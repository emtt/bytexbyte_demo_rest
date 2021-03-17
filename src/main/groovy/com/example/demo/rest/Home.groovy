package com.example.demo.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class Home {

    @GetMapping("/test")
    ResponseEntity<?> test(){
        def response = [:]
        response.put("nombre", "John")
        response.put("apellido", "Connor")
        response.put("edad", 24)

        return new ResponseEntity<?>(response, HttpStatus.OK)
    }

}
