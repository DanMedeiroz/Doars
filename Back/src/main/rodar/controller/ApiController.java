package main.rodar.controller;


import jdk.jfr.Description;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class ApiController {
    @GetMapping("/teste")
    public  ResponseEntity<String> teste(){
        return ResponseEntity.ok("teste");
    }
}