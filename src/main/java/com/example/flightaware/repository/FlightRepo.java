package com.example.flightaware.repository;

import com.example.flightaware.model.UserIp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightRepo extends CrudRepository<UserIp, Long> {

}
