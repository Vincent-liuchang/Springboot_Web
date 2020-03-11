package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GalleryController {
    @RequestMapping(value = "/gallery")
    public String initial(){
        return "gallery";
    }
}