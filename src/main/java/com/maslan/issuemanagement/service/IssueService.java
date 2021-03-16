package com.maslan.issuemanagement.service;

import com.maslan.issuemanagement.dto.IssueDto;
import com.maslan.issuemanagement.entity.Issue;
import com.maslan.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issueDto);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageble(Pageable pageable);

    Boolean delete(IssueDto issue);

}
