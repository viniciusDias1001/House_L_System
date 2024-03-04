package github.io.viniciuDias1001.com.House_L_System.service;

import github.io.viniciuDias1001.com.House_L_System.Enum.TaskStatus;
import github.io.viniciuDias1001.com.House_L_System.entity.Task;
import github.io.viniciuDias1001.com.House_L_System.repository.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceTask {
    public TaskRepository taskRepository;

    public ServiceTask(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getTask(){
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Taks not found"));
    }

    public Task getTaskByPriority(Integer priority){
        return taskRepository.findByPriority(priority).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found"));
    }

    @Transactional
    public Task saveTask(Task task){
        task.setDateCrated(LocalDate.now());
        task.setTaskStatus(TaskStatus.valueOf("PENDING"));
        return taskRepository.save(task);
    }

    @Transactional
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

    // and deleteTask
}
