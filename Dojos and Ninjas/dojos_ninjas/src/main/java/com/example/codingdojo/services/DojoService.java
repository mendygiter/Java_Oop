package com.example.codingdojo.services;

import com.example.codingdojo.models.Dojo;
import com.example.codingdojo.repositories.DojoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    private final DojoRepository dojoRepository;

    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

////    create new dojo
//    public Dojo createDojo(Dojo b) {
//        return dojoRepository.save(b);
//    }
    public Dojo createDojo(Dojo b) {
    return dojoRepository.save(b);
}

    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }

    public Dojo getOne(Long id) {
        Optional<Dojo> dojo = dojoRepository.findById(id);
        return dojo.isPresent() ? dojo.get() :null;
     }


}

