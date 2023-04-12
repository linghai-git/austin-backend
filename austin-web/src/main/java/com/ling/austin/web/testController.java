package com.ling.austin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    /**
     * test demo spring boot combine
     * @return
     */
    @GetMapping("/test")
    private String test(){
        return "this is a test demo!";
    }
}
