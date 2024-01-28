package com.goel.PaintSanitaryAndHardware.repository;
import java.util.*;
import com.goel.PaintSanitaryAndHardware.dto.UserDto;
import com.goel.PaintSanitaryAndHardware.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<UserDto> getALlUsersDetail(){
        String q="Select u from User";
        Query query=entityManager.createQuery(q);
        List<User> list=query.getResultList();
        List<UserDto> listDto=new ArrayList<>();
        for(User user:list){
            UserDto userdto=new UserDto();
            userdto=userdto.UserToUserDto(user);
            listDto.add(userdto);
        }
        return listDto;
    }
    public UserDto getUserDetails(int userId){
        User user=entityManager.find(User.class,userId);
        UserDto userDto=new UserDto();
        userDto.UserToUserDto(user);


        return userDto;
    }
    public void addUserDetails(UserDto userDto){
        User user=new User();
        user=user.userDtoToUser(userDto);
        entityManager.persist(user);
    }
    public void updateUserEmailId(UserDto userDto,String emailId){
        User user=new User();
        user.setEmailId(emailId);
        entityManager.persist(user);
    }

    public void deleteUser(int userId){
        User user=entityManager.find(User.class,userId);
        entityManager.remove(user);
    }

//    public void setUserDetails(U)
}
