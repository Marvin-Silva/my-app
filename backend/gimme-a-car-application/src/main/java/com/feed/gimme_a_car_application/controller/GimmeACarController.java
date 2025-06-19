
package com.feed.gimme_a_car_application.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/v1/cars")
public class GimmeACarController {

    @GetMapping
    public String getCar() {
        return "Hello World";
    }
}
