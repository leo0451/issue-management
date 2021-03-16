package com.maslan.issuemanagement.service;

import com.maslan.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project getById(Long id);

    Page<Project> getAllPageble(Pageable pageable);

    Boolean delete(Project project);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjrctCodeCoontains(String projctCode);



}
