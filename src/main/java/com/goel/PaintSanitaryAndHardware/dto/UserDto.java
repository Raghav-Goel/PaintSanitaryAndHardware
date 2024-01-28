package com.goel.PaintSanitaryAndHardware.dto;

import com.goel.PaintSanitaryAndHardware.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserDto {
    Integer userId;
    String name;
    String emailId;

    String password;
    String phoneNumber;
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public UserDto UserToUserDto(User user){
        UserDto userDto=new UserDto();
        userDto.setPassword(user.getPassword());
        userDto.setName(user.getName());
        userDto.setEmailId(user.getEmailId());
        userDto.setUserId(user.getUserId());
        userDto.setPhoneNumber(user.getPhoneNumber());
        return userDto;
    }


}
