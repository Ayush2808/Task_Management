package com.example.taskmanagement.repository;

import com.example.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository<Long, Task> extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);
    List<Task> findByStatusAndUserId(String status, Long userId);
    List<Task> findByPriorityAndUserId(String priority, Long userId);
    List<Task> findByDueDateAndUserId(Date dueDate, Long userId);
    List<Task> findByTitleContainingOrDescriptionContainingAndUserId(String title, String description, Long userId);
}

