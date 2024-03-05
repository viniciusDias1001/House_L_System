package github.io.viniciuDias1001.com.House_L_System.controllers;


import github.io.viniciuDias1001.com.House_L_System.entity.Task;
import github.io.viniciuDias1001.com.House_L_System.service.ServiceTask;
import jakarta.servlet.annotation.HttpConstraint;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class ControllerTask {

    public ServiceTask serviceTask;

    public ControllerTask(ServiceTask serviceTask){
        this.serviceTask = serviceTask;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Task> getTasks(){
        return serviceTask.getTask();
    }


    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Task getTaskById(@PathVariable Long id){
        return serviceTask.getTaskById(id);
    }

    @GetMapping("/priority")
    @ResponseStatus(HttpStatus.OK)
    public Task getTaskByPriority(@RequestParam Integer priority){
        return serviceTask.getTaskByPriority(priority);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@Valid @RequestBody Task task){
        return serviceTask.saveTask(task);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@Valid @PathVariable Long id){
        serviceTask.deleteTask(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails){
        return serviceTask.updateTask(id, taskDetails);
    }


}
