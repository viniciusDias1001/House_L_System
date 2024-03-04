package github.io.viniciuDias1001.com.House_L_System.service;

import github.io.viniciuDias1001.com.House_L_System.entity.House;
import github.io.viniciuDias1001.com.House_L_System.repository.HouseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServiceHouse {
    public HouseRepository houseRepository;

    public ServiceHouse(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public House GetHouseByName(String name){
        return houseRepository.findByName(name).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"House not found"));
    }

    public java.util.List<House> GetHouse(){
        return houseRepository.findAll();
    }

    public House GetHouseByID(Long id){
       return houseRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"House not found"));
    }
    public House SaveHouse(House house){
        return houseRepository.save(house);
    }

    public void DeleteHouse(Long id){
        houseRepository.deleteById(id);
    }
}
