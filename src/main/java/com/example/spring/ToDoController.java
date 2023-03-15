/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
/**
 *
 * @author Valame
 */
public class ToDoController {
    private ToDoInterface tds;

    @Autowired
    public ToDoController(ToDoInterface tds) {
        this.tds = tds;
    }
    
    @PostMapping(path="/mvc/add") // Map ONLY POST Requests
    public  String addNewUser (@RequestParam String task) {
    
    ToDoItem i = new ToDoItem();
    i.setItem(task);
    tds.save(i);
    return "redirect:/mvc";
  }
  
    @GetMapping("/myItems")
    public Iterable<ToDoItem> returnItems(){
        return tds.findAll();
    }
    
    
    @GetMapping("/mvc")
    public ModelAndView mvc()  {
        ModelAndView modelAndView = new ModelAndView("index");    
        modelAndView.addObject("tasks", tds.findAll());
        return modelAndView;
    }
}
