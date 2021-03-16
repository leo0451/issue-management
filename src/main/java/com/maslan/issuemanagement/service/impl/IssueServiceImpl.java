package com.maslan.issuemanagement.service.impl;

import com.maslan.issuemanagement.dto.IssueDto;
import com.maslan.issuemanagement.entity.Issue;
import com.maslan.issuemanagement.repository.IssueRepository;
import com.maslan.issuemanagement.service.IssueService;
import com.maslan.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;


public class IssueServiceImpl implements IssueService {

    //run time da değişmesini önlemiş oluruz final yazarak
    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    //@Autowired
    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issue) {
        if (issue.getDate() == null) {
            throw new IllegalArgumentException("issue date can not to be null");
        }
        Issue issueDb = modelMapper.map(issue, Issue.class);
        issueDb = issueRepository.save(issueDb);
        return modelMapper.map(issueDb, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        Issue issue= issueRepository.getOne(id);
        Issue issueDb = modelMapper.map(issue, Issue.class);

        return modelMapper.map(issueDb,IssueDto.class);
    }

    @Override
    public TPage<IssueDto> getAllPageble(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        TPage page = new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(), IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;

    }

    @Override
    public Boolean delete(IssueDto issue) {


        return Boolean.TRUE;
    }
}
