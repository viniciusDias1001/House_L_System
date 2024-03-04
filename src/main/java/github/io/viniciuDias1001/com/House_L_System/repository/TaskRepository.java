package github.io.viniciuDias1001.com.House_L_System.repository;

import github.io.viniciuDias1001.com.House_L_System.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {

    Optional<Task> findByPriority(Integer priority);
}
