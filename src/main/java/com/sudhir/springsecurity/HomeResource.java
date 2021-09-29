package com.sudhir.springsecurity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeResource {

    @GetMapping("/")
    public String all() {
        return ("<h1>Welcome</h1>");
    }
    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome user</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome admin</h1>");
    }
}
