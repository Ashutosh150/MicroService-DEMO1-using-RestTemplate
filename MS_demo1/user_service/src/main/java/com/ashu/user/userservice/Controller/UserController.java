package com.ashu.user.userservice.Controller;

import com.ashu.user.userservice.Entity.User;
import com.ashu.user.userservice.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId){

        User user = this.userService.getUser(userId);

        //calling data from other Service/Module using url "http://localhost:9002/contact/user/1311"
//        List contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user/" + user.getUserId(), List.class);

        // calling data from other Service/Module using Eureka server Application name
        List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/" + user.getUserId(), List.class);


        user.setContacts(contacts);


        return user;
    }

}
