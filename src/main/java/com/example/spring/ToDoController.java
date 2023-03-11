/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String task) {
    
    ToDoItem i = new ToDoItem();
    i.setItem(task);
    tds.save(i);
    return "Saved";
  }
  
    @GetMapping("/myItems")
    public Iterable<ToDoItem> returnItems(){
        return tds.findAll();
    }
    
        
}
