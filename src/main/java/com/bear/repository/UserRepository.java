package com.bear.repository;

import com.bear.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 3/28/17.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByUserName(String userName);

    Page<User> findAll(Pageable pageable);

    void deleteById(Long id);
}
