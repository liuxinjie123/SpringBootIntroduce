package com.dream.controller.restful;

import com.dream.representation.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Result helloMethod() {
        return Result.success().putData("hello", "Hello World");
    }

}
