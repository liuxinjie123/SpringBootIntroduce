package com.dream.controller.restful;

import com.dream.representation.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @RequestMapping("/error/test/1")
    public Result testErrorMethod1() {
        return Result.error("test error", 10000);
    }

    @RequestMapping("/error/test/2")
    public Result testErrorMethod2() {
        return Result.error("test error");
    }
}
