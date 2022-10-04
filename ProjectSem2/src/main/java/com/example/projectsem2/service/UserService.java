package com.example.projectsem2.service;

import com.example.projectsem2.model.UserBO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    Optional<UserBO> findById(Long id);

    void saveUser(UserBO userBO);

    //lấy tất cả
    List<UserBO> listUser();

    //tìm theo id
    UserBO findUserById(Long id);

    //xóa
    void deleteUser(Long id);
}
