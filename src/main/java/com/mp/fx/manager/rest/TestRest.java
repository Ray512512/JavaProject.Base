package com.mp.fx.manager.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/love")
public class TestRest {

    @RequestMapping("/test")
    public String test() throws Exception{
        return "test";
    }

    @RequestMapping("/who")
    public String love() throws Exception{
        return "pupu";
    }
}
