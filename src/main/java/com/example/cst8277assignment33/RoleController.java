package com.example.cst8277assignment33;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RoleController {

    @Autowired
    RoleRepository roleRepository;


    @GetMapping("/roles")
    public @ResponseBody
    Iterable<Role> getAllRoles() {

        return roleRepository.findAll();

    }

    @PostMapping(path = "/addrole")
    public @ResponseBody
    String addNewUser(@RequestParam int id,
                      @RequestParam String name,
                      @RequestParam String description) {
        Role role = new Role();
        role.setId(id);
        role.setName(name);
        role.setDescription(description);

        return "New com.example.cst8277assignment33.Role Added to system!";


    }


}
