/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
/**
 *
 * @author Valame
 */
public interface ToDoInterface extends CrudRepository<ToDoItem, Integer>{
    
}
