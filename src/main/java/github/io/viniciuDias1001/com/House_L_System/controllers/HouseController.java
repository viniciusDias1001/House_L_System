package github.io.viniciuDias1001.com.House_L_System.controllers;


import github.io.viniciuDias1001.com.House_L_System.entity.House;
import github.io.viniciuDias1001.com.House_L_System.entity.Task;
import github.io.viniciuDias1001.com.House_L_System.service.ServiceHouse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/houses")
public class HouseController {

    public ServiceHouse serviceHouse;

    public HouseController(ServiceHouse serviceHouse){
        this.serviceHouse = serviceHouse;
    }
    //get delete create

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<House> getHouses(){
        return serviceHouse.getHouse();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public House getHouseById(@RequestParam Long id){
        return serviceHouse.getHouseByID(id);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public House getHouseByName(@RequestParam String name){
        return serviceHouse.getHouseByName(name);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public House createHouse(@RequestBody House house){
        return serviceHouse.saveHouse(house);
    }


    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteHouse(@PathVariable Long id){
        serviceHouse.deleteHouse(id);
    }

}
