/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
@Controller
/**
 *
 * @author Valame
 */
public class ToDoController {

    @Autowired
    private  ToDoInterface tds;
    
    @GetMapping("/")
    public ModelAndView home(ModelAndView m){
//        ModelAndView modelAndView = new ModelAndView();
          m.setViewName("index");
          m.addObject("tasks", tds.findAll());
          return m;
    }
    
    @PostMapping(path="/mvc/add") // Map ONLY POST Requests
    public String addNewUser (@RequestParam String task) {
        ToDoItem i = new ToDoItem();
        i.setItem(task);
        tds.save(i);
        return "redirect:/";
    }
    
    @GetMapping(path="/mvc/delete/{id}")
    public String deleteUse(@PathVariable("id") Integer id){
        tds.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("/myItems")
    public Iterable<ToDoItem> returnItems(){
        return tds.findAll();
    }
    
        
}
