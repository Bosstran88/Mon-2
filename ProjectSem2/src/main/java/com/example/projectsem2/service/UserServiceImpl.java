package com.example.projectsem2.service;

import com.example.projectsem2.model.UserBO;
import com.example.projectsem2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;


    @Override
    public Optional<UserBO> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void saveUser(UserBO userBO) {
        userRepository.save(userBO);
    }

    @Override
    public List<UserBO> listUser() {
        return userRepository.findAll();
    }

    @Override
    public UserBO findUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
