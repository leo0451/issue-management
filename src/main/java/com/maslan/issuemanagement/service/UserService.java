package com.maslan.issuemanagement.service;

import com.maslan.issuemanagement.entity.Issue;
import com.maslan.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<User> getAllPageble(Pageable pageable);

    Boolean delete(User user);

    User getByUsername(String username);
}
