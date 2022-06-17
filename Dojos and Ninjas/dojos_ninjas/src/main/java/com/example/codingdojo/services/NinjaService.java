package com.example.codingdojo.services;

import com.example.codingdojo.models.Ninja;
import com.example.codingdojo.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;


    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public Ninja createNinja (Ninja b) {
        return ninjaRepository.save(b);
    }
}
