package demo.ignat.prometheus.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("hello")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello");
    }
}
