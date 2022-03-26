package com.example.cst8277assignment33;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
public class UserController {

    @Autowired
    UserRepository userRepository;



    @GetMapping("/users")
    public @ResponseBody
    Iterable<User> getAllUsers() {

        return userRepository.findAll();

    }

    @PostMapping(path="/adduser")
    public @ResponseBody
    String addNewUser(@RequestParam String name,
                      @RequestParam String email,
                      @RequestParam String password,
                      @RequestParam int created,
                      @RequestParam int last_visit_id) {

        log.info("Inside the method to post a user!");


        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setCreated(created);
        user.setLast_visit_id(last_visit_id);
        userRepository.save(user);
        return "User Added to system!";


    }



    @GetMapping("/welcome")
    public String showWelcome() {
        return "Welcome to com.example.cst8277assignment33.User Management Service!";
    }
}
