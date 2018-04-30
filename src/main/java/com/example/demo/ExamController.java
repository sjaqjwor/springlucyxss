package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class ExamController {

    @Autowired
    private TableMapper tm;

    @GetMapping("/hello")
    public String exam(){
        return "hello";
    }

    @RequestMapping(value = "/down",method = RequestMethod.POST)
    public String exam1(Model model,Rquest r){
        System.err.println(r.getSc());
        tm.save(r.getSc());
        return "save";
    }
    @GetMapping("/save")
    public String exam2(Model model){
        System.err.println(tm.sec());
        model.addAttribute("title",tm.sec());
        return "save";
    }
}
