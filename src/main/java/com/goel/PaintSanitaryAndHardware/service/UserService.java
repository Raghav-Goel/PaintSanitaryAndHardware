package com.goel.PaintSanitaryAndHardware.service;

import com.goel.PaintSanitaryAndHardware.dto.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



public interface UserService {
    public UserDto getUserDetails(int userId);
    public void addUserDetails(UserDto userDto);
    public void updateUserEmailId(UserDto userDto,String emailId);
    public void deleteUser(int userId);
}
