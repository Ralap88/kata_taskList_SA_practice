package com.codurance.training.tasks.entity;

import com.codurance.training.tasks.Task;

import java.util.*;

public class ProjectsList {
    private final Map<String, List<Task>> tasks = new LinkedHashMap<>();

    public Set<Map.Entry<String, List<Task>>> entrySet() {
        return tasks.entrySet();
    }

    public void put(String name, ArrayList<Task> tasks) {
        this.tasks.put(name, tasks);
    }

    public List<Task> get(String project) {
        return tasks.get(project);
    }
}