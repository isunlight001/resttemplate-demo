package com.sunlight001.repository;

import com.sunlight001.entity.User;

import java.util.Collection;
/**
 * @author sunlight001
 */
public interface UserRepository {
    /**
     * 返回userlist
     * @return
     */
    public Collection<User> findAll();

    /**
     * 根据ID查找user
     * @param id
     * @return
     */
    public User findById(Long id);

    /**
     * 更新user
     * @param user
     */
    public void saveOrUpdate(User user);

    /**
     * 根据ID进行删除
     * @param id
     */
    public void deleteById(Long id);
}