package org.learning.springboot.containters.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Greeting System", description = "System to greet")
public class GreetingController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @GetMapping("/guests/{name}")
    @ApiOperation(value = "Api that greets Guests", response = String.class)
    String greet(@PathVariable("name") String name) {
        return "Welcome " + name + " !";
    }

}
