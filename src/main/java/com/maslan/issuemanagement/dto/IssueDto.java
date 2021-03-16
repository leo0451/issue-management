package com.maslan.issuemanagement.dto;

import com.maslan.issuemanagement.entity.IssueStatus;
import com.maslan.issuemanagement.entity.Project;
import com.maslan.issuemanagement.entity.User;
import lombok.Data;

import java.util.Date;
@Data
public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus status;
    private UserDto assignee;
    private ProjectDto project;
}
