package com.example.projectsem2.repository;

import com.example.projectsem2.model.UserBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface UserRepository extends JpaRepository<UserBO,Long> {
}
