package github.io.viniciuDias1001.com.House_L_System.service;

import github.io.viniciuDias1001.com.House_L_System.entity.House;
import github.io.viniciuDias1001.com.House_L_System.entity.Place;
import github.io.viniciuDias1001.com.House_L_System.repository.HouseRepository;
import github.io.viniciuDias1001.com.House_L_System.repository.PlaceRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServiceHouse {
    public HouseRepository houseRepository;

    public PlaceRepository placeRepository;

    public ServiceHouse(HouseRepository houseRepository, PlaceRepository placeRepository) {
        this.houseRepository = houseRepository;
        this.placeRepository = placeRepository;
    }

    public House getHouseByName(String name){
        return houseRepository.findByName(name).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"House not found"));
    }

    public java.util.List<House> getHouse(){
        return houseRepository.findAll();
    }

    public House getHouseByID(Long id){
       return houseRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"House not found"));
    }

    @Transactional
    public House saveHouse(House house) {
        return houseRepository.save(house);
    }
    @Transactional
    public void deleteHouse(Long id){
        houseRepository.deleteById(id);
    }
}
