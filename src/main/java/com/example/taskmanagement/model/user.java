package com.example.taskmanagement.model;

import javax.persistence.*;
import java.util.Set;

    @Entity
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;
        private String password;

        @OneToMany(mappedBy = "user")
        private Set<Task> tasks;

        // Getters and Setters
    }

}
