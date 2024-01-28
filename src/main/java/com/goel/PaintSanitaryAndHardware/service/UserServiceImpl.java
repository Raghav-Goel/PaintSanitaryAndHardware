package com.goel.PaintSanitaryAndHardware.service;

import com.goel.PaintSanitaryAndHardware.dto.UserDto;
import com.goel.PaintSanitaryAndHardware.entity.User;
import com.goel.PaintSanitaryAndHardware.repository.UserRepository;
import com.goel.PaintSanitaryAndHardware.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepositoryImpl userRepository;
    public UserDto getUserDetails(int userId){
        UserDto userdto=userRepository.getUserDetails(userId);
        if(userdto==null){
            System.out.println("user value is null");
            throw new RuntimeException("User is null");
        }
        return userdto;
    }
    public void addUserDetails(UserDto userDto){
        userRepository.addUserDetails(userDto);
    }

    public void updateUserEmailId(UserDto userDto,String emailId){
        userRepository.updateUserEmailId(userDto,emailId);
    }
    public void deleteUser(int userId){
        userRepository.deleteUser(userId);
    }
}
