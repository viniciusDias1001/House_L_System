package github.io.viniciuDias1001.com.House_L_System.service;

import github.io.viniciuDias1001.com.House_L_System.entity.House;
import github.io.viniciuDias1001.com.House_L_System.entity.Place;
import github.io.viniciuDias1001.com.House_L_System.repository.HouseRepository;
import github.io.viniciuDias1001.com.House_L_System.repository.PlaceRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicePlace {

    private final PlaceRepository placeRepository;
    private final HouseRepository houseRepository;


    public ServicePlace(PlaceRepository placeRepository, HouseRepository houseRepository) {
        this.placeRepository = placeRepository;
        this.houseRepository = houseRepository;
    }

    public Place savePlace(Long houseId, Place place) {
        House house = houseRepository.findById(houseId).orElseThrow(() -> new RuntimeException("Casa não encontrada com o ID: " + houseId));
        place.setHouse(house);
        return placeRepository.save(place);
    }

}
