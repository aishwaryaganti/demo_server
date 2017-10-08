package com.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LogController {

    @RequestMapping(value = "/Welcome")

    public String Login()
    {
        String msg="this is sample";
        return new String(msg);
    }
}
