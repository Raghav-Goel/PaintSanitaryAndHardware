package com.goel.PaintSanitaryAndHardware.repository;

import com.goel.PaintSanitaryAndHardware.dto.UserDto;

public interface UserRepository {
    public UserDto getUserDetails(int userId);
    public void addUserDetails(UserDto userDto);
    public void updateUserEmailId(UserDto userDto,String emailId);
    public void deleteUser(int userId);
}
