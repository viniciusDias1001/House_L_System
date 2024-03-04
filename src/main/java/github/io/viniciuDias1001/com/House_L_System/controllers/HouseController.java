package github.io.viniciuDias1001.com.House_L_System.controllers;


import github.io.viniciuDias1001.com.House_L_System.entity.House;
import github.io.viniciuDias1001.com.House_L_System.entity.Place;
import github.io.viniciuDias1001.com.House_L_System.service.ServiceHouse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/houses")
public class HouseController {

    public ServiceHouse serviceHouse;



    public HouseController(ServiceHouse serviceHouse){
        this.serviceHouse = serviceHouse;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<House> getHouses(){
        return serviceHouse.getHouse();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public House getHouseById(@PathVariable Long id){
        return serviceHouse.getHouseByID(id);
    }


    @GetMapping("/name")
    @ResponseStatus(HttpStatus.OK)
    public House getHouseByName(@RequestParam String name){
        return serviceHouse.getHouseByName(name);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public House createHouse(@Valid @RequestBody House house){
        return serviceHouse.saveHouse(house);
    }


    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteHouse( @Valid @PathVariable  Long id){
        serviceHouse.deleteHouse(id);
    }

}
