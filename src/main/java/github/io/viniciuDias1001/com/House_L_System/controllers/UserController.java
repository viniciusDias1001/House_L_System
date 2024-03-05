package github.io.viniciuDias1001.com.House_L_System.controllers;

import github.io.viniciuDias1001.com.House_L_System.entity.User;
import github.io.viniciuDias1001.com.House_L_System.service.ServiceUser;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    public ServiceUser serviceUser;

    public UserController(ServiceUser serviceUser){
        this.serviceUser = serviceUser;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers(){
        return serviceUser.getUser();
    }

    @GetMapping("/name")
    public User getUserByName(String name){
        return serviceUser.getUserByName(name);
    }
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUserById(Long id){
        return serviceUser.getUserById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(User user){
        return serviceUser.saveUser(user);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(Long id){
        serviceUser.deleteUser(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails){
        return serviceUser.updateUser(id, userDetails);
    }
}
