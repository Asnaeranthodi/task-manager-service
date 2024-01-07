package com.taskmanager.taskmanager.repository;

import com.taskmanager.taskmanager.model.Task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Spring Data JPA provides CRUD methods out-of-the-box
    @Query("SELECT t FROM Task t ORDER BY t.id DESC")
    List<Task> findAllTasksOrderedByIdDesc();
}

