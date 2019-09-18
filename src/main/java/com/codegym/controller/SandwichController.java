package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("sandwich")
public class SandwichController {
    @GetMapping("/search-sandwich")
    public String searchSandwich(@RequestParam("a") String search){
        return "/sandwich/search";
    }
    @GetMapping("/search")
    public String searchCustomerForm(){
        return "/sandwich/search";
    }
}
