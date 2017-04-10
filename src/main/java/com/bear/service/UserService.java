package com.bear.service;

import com.bear.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by root on 3/29/17.
 */
public interface UserService {
    User findUserByUserName(String userName);
    Page<User> findAll(Pageable pageable);
    void saveUser(User user);
    void deleteById(Long id);
}
