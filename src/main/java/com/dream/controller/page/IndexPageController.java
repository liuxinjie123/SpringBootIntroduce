package com.dream.controller.page;

import com.dream.representation.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexPageController {

    @GetMapping(value = "/")
    public String indexPage() {
        return "index";
    }
}
