package com.sunlight001.repository;

import com.sunlight001.entity.User;

import java.util.Collection;
/**
 * @author sunlight001
 */
public interface UserRepository {
    public Collection<User> findAll();
    public User findById(Long id);
    public void saveOrUpdate(User user);
    public void deleteById(Long id);
}