package com.example.demoRestAPI.Service.Impl;

import com.example.demoRestAPI.DTO.ProjectDTO;
import com.example.demoRestAPI.Entity.Project;
import com.example.demoRestAPI.Repository.ProjectRepo;
import com.example.demoRestAPI.Service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepo projectRepo;
    private final ModelMapper modelMapper;


    @Override
    public List<ProjectDTO> getAllProjects() {
        List<Project> projects = projectRepo.findAll();
        return projects
                .stream()
                .map(project -> modelMapper.map(project, ProjectDTO.class))
                .toList();
    }

    @Override
    public ProjectDTO getProjectById(Long id) {
        Project project = projectRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with ID: " + id));
        return modelMapper.map(project, ProjectDTO.class);
    }
}
