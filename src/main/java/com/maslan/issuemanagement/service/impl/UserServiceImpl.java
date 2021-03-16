package com.maslan.issuemanagement.service.impl;

import com.maslan.issuemanagement.entity.User;
import com.maslan.issuemanagement.repository.UserRepository;
import com.maslan.issuemanagement.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User save(User user) {
        if (user.getEmail()==null){
            throw  new IllegalArgumentException("user's e-mail not null");
        }
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Page<User> getAllPageble(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(User user) {
        userRepository.delete(user);
        return Boolean.TRUE;
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
