package com.maslan.issuemanagement.service;

import com.maslan.issuemanagement.entity.Issue;
import com.maslan.issuemanagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {

    IssueHistory save(IssueHistory issue);

    IssueHistory getById(Long id);


    Page<IssueHistory> getAllPageble(Pageable pageable);

    Boolean delete(IssueHistory issueHistory);
}
