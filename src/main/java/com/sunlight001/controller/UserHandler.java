package com.sunlight001.controller;

import com.sunlight001.entity.User;
import com.sunlight001.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
/**
 * @author sunlight001
 */
@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("findAllUser")
    public Collection<User> findAllUser(){
        return userRepository.findAll();
    }

    @GetMapping("/findAll")
    public Collection<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Long id){
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public Collection<User> save(@RequestBody User user){
        userRepository.saveOrUpdate(user);
        return userRepository.findAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userRepository.saveOrUpdate(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        userRepository.deleteById(id);
    }
}
