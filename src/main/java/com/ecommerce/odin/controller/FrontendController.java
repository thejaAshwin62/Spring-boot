package com.ecommerce.odin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @GetMapping("/{path:[^\\.]*}")
    public String forwardToReactApp() {
        return "forward:/index.html";
    }
}
