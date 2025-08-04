package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World!";
    }

    @RequestMapping("/david")
    public @ResponseBody String greetingDavid() {
        return "Hello, David!";
    }

    @RequestMapping("/outro-endpoint")
    public @ResponseBody String outroEndpoint() {
        return "Outro...";
    }
}
