package com.goel.PaintSanitaryAndHardware;

import com.goel.PaintSanitaryAndHardware.dto.UserDto;
import com.goel.PaintSanitaryAndHardware.repository.UserRepository;
import com.goel.PaintSanitaryAndHardware.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PaintSanitaryAndHardwareApplication implements CommandLineRunner {
	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(PaintSanitaryAndHardwareApplication.class, args);
	}
	@Override
	public void run(String... args){
		// getCustomer();
		UserDto userDto=new UserDto();
		userDto.setUserId(2);
		userDto.setName("Ram");
		userDto.setPhoneNumber("9297876896");
		userDto.setEmailId("ccu@xyz.com");
		userDto.setPassword("crytv");
		userService.addUserDetails(userDto);
//		userService.deleteUser(2);
	}

}
