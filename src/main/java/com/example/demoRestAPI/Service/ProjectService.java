package com.example.demoRestAPI.Service;

import com.example.demoRestAPI.DTO.ProjectDTO;

import java.util.List;

public interface ProjectService {
    List<ProjectDTO> getAllProjects();

    ProjectDTO getProjectById(Long id);
}
