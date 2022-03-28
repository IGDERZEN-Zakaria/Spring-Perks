package com.techinterface.service.impl;

import com.techinterface.model.User;
import com.techinterface.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);




    // try 'Zack' for test
    @Override
    public User getUserById(String userid) {
        User user = new User();
        user.setFirstname("Zack");
        user.setLastname("Weard");
        user.setLocation("Kouba");
        user.setPincode("16055");
        user.setCountrycode("213");

        if (Objects.equals(userid, user.getFirstname()))
        return user;
        else return null;
    }

    @Override
    public List<User> getAllUsers() {
        User user = new User();
        user.setFirstname("TestUser");
        return Collections.singletonList(user);
    }

    @Override
    public String deleteUserById(String userid) {
        return "Deleted Successfully";
    }

    @Override
    public User saveUser(User user) {
        return user;
    }
}
