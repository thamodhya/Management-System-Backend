package com.example.Student_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.example.Student_Management_System.entity.OurUsers;

public interface UsersRepo extends JpaRepository<OurUsers, Integer> {
    Optional<OurUsers> findByEmail(String email);
}
