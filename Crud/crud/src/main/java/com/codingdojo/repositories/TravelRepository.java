package com.codingdojo.repositories;

import com.codingdojo.models.Travel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//This file is where we implement all our crud
@Repository
public interface TravelRepository extends CrudRepository<Travel, Long> {
    List<Travel> findAll();
}
