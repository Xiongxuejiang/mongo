package com.bear.service.impl;

import com.bear.controller.UserController;
import com.bear.entity.User;
import com.bear.repository.UserRepository;
import com.bear.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * Created by root on 3/29/17.
 */
@Service
public class UserServiceImpl implements UserService{

    private static final Logger logger = (Logger) Logger.getLogger(UserServiceImpl.class.getName());

    @Autowired
    private UserRepository userRepository;


    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findUserByUserName(userName);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public void saveUser(User user) {
        logger.info("jinru!");
        userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
