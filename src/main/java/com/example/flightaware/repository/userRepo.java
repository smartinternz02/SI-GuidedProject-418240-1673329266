package com.example.flightaware.repository;

import com.example.flightaware.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface userRepo extends CrudRepository<User,Long> {
    User findByEmailIdIgnoreCase(String emailId);

}
