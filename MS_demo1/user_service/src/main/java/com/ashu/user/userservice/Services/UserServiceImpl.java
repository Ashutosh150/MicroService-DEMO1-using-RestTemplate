package com.ashu.user.userservice.Services;

import com.ashu.user.userservice.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{


    //fake UserList technically this is to be done from DB using JPA
    List<User> list = List.of(
            new User(1311L, "Ashutosh", "9999999999"),
            new User(1312L, "Prince", "8888888888"),
            new User(1313L, "Harshad", "7777777777")
    );



    @Override
    public User getUser(Long userId) {
        return this.list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }
}
