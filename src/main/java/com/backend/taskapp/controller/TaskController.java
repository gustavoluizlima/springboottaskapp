package com.backend.taskapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.backend.taskapp.model.Task;

@Controller
public class TaskController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @PostMapping("/index")
    public void create(Task task) {
        System.out.println("O nome da tarefa é: " + task.getName());
    }
}
