package com.test.service;


import com.test.model.User;
import com.test.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService 
{
    @Autowired
    private UserRepository userRepository;

    public User fetchUserByPsid(String psid)
    {
        return userRepository.findByPsid(psid);
    }

    public User fetchUserByPsidAndPassword(String psid, String password)
    {
        return userRepository.findByPsidAndPassword(psid, password);
    }

    public List<User> listAll()
    {
        return userRepository.findAll();
    }

    public User get(int id)
    {
        return userRepository.findById(id).get();

    }

    public User save(User user)
    {
       return userRepository.save(user);
    }

    public User update(User user)
    {
        return userRepository.save(user);
    }

    public User updateUser(int id)
    {
        return userRepository.findById(id).get();
    }

    public void delete(int id)
    {
        userRepository.deleteById(id);
    }

}
