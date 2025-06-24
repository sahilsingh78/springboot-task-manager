package com.example.taskmanager.model;

public class Task {
    private Long id;
    private String name;
    private boolean completed;

    public Task() {}

    public Task(Long id, String name) {
        this.id = id;
        this.name = name;
        this.completed = false;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
