package com.codingdojo.services;

import com.codingdojo.models.Travel;
import com.codingdojo.repositories.TravelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelService {
//    connecting the repository to the service
    private final TravelRepository travelRepository;

    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

//         returns all the travel
        public List<Travel> allTravels() {
            return travelRepository.findAll();
        }
        // creates a book
        public Travel createTravel(Travel b) {
            return travelRepository.save(b);
        }

        public Travel findTravelById(Long id) {
            Optional<Travel> optionalTravel = travelRepository.findById(id);
//            if(optionalTravel.isPresent()) {
//                return optionalTravel.get();
//            } else {
//                return null;
//            }
            return optionalTravel.isPresent() ? optionalTravel.get():null;
        }

    public Travel updateTravel(Travel b) {
        return travelRepository.save(b);
    }

    public void deleteTravel(Long id) {
        travelRepository.deleteById(id);
    }


}
