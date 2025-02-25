package main.java.Controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController//lida com htpp
@RequestMapping("Doar")

public class Api {
    @GetMapping("teste")

    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("TESTE");
    }
}