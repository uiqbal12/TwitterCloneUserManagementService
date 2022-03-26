package com.example.cst8277assignment33;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
public class UserController {

    @Autowired
    UserRepository userRepository;


/*This is the GET mapping to retrieve all users making use of the CRUD interface method of findall(): */
    @GetMapping("/users")
    public @ResponseBody
    Iterable<User> getAllUsers() {

        return userRepository.findAll();

    }
/* This is the mapping for POST method to add a user in the database, it takes the parameters of name, email, password, created, last_visit_id
     It also auto generates the id for you and inserts the record in the database specified */
    @PostMapping(path="/adduser")
    public @ResponseBody
    String addNewUser(@RequestParam String name,
                      @RequestParam String email,
                      @RequestParam String password,
                      @RequestParam int created,
                      @RequestParam int last_visit_id) {
/* to help with debugging, wanted to log the info when the system enters addNewUser to make sure that we are speaking with the database
but the problem lies in the SQL manipulation and not the REST Mapping
 */
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




}
