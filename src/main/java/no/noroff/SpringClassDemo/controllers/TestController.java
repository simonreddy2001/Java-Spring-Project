package no.noroff.SpringClassDemo.controllers;

import no.noroff.SpringClassDemo.models.CustomResponse;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
public class TestController {
    @GetMapping("/")
    public String getHello(){
        return "Hello Spring";
    }

    @PostMapping("/")
    public String getPost() {
        return "Hello Postman";
    }

    @GetMapping("/search")
    public String searching(@RequestParam String query) {
        return "Search terms" + query;
    }

    @GetMapping("/customers/{id}")
    public String getCustomer(@PathVariable int id) {
        return "Customer " + id;
    }

    @GetMapping("/custom")
    public CustomResponse getCustomResponse() {
        return new CustomResponse("Hello Again, form the other side");
    }
}
