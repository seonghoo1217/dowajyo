package com.dowajyo.controller.mvc;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/chat/chat")
    public String chatForm(){

        return "/chat/chat";
    }
}

