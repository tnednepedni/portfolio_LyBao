package com.example.demoRestAPI.Repository;

import com.example.demoRestAPI.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Long> {
}
