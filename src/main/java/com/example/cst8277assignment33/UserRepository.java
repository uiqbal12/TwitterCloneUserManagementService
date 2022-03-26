package com.example.cst8277assignment33;

import org.springframework.data.repository.CrudRepository;
/* well make use of the CRUD interface methods to retrieve data with the help of off the shelf methods */

public interface UserRepository extends CrudRepository<User, Integer> {

}