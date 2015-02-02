package com.stevenheseltine.api.resource.controller;


import com.stevenheseltine.api.resource.model.HelloWorld;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private String greeting = "Hello";

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    HelloWorld sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new HelloWorld(greeting, name);
    }
}
