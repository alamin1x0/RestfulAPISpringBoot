package com.example.getapi.service;

import com.example.getapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Al-Amin", 24, "alamin.cse@gmail.com");
        User user2 = new User(2, "Sakib", 24, "alamin.cse@gmail.com");
        User user3 = new User(3, "Akash", 24, "alamin.cse@gmail.com");
        User user4 = new User(4, "Arifa", 24, "alamin.cse@gmail.com");
        User user5 = new User(5, "Tani", 24, "alamin.cse@gmail.com");
        User user6 = new User(6, "Tasrin", 24, "alamin.cse@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5,user6));
    }


    public Optional<User> getUser(Integer id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

}
