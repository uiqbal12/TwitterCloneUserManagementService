package com.example.cst8277assignment33;

import org.springframework.data.repository.CrudRepository;


/*Will allow us to make use of off the shelf methods which woud assist us in retrieving data from the db */

public interface RoleRepository extends CrudRepository<Role, Integer> {

}