package com.example.cst8277assignment33;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RoleController {

    @Autowired
    RoleRepository roleRepository;

// GET mapping to retrieve all roles from the database, is from a different table in the db called roles from the ums schema
    @GetMapping("/roles")
    public @ResponseBody
    Iterable<Role> getAllRoles() {

        return roleRepository.findAll();

    }
// was not needed in the assignment per se, but this is an implementation of the add role method which adds a role in the db
    @PostMapping(path = "/addrole")
    public @ResponseBody
    String addNewUser(@RequestParam int id,
                      @RequestParam String name,
                      @RequestParam String description) {
        Role role = new Role();
        role.setId(id);
        role.setName(name);
        role.setDescription(description);

        return "Role Added to system!";


    }


}
