public package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public ResponseEntity<?> addTask(@RequestBody Task input) {
        Task newTask = taskService.addTask(input.getName());
        if (newTask == null) {
            return ResponseEntity.badRequest().body("Task already exists.");
        }
        return ResponseEntity.ok(newTask);
    }

    @PatchMapping("/{id}/complete")
    public ResponseEntity<?> markComplete(@PathVariable Long id) {
        boolean updated = taskService.markCompleted(id);
        return updated ? ResponseEntity.ok("Task marked complete.") :
                ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        boolean removed = taskService.deleteTask(id);
        return removed ? ResponseEntity.ok("Task deleted.") :
                ResponseEntity.notFound().build();
    }
}
 TaskController {
    
}
