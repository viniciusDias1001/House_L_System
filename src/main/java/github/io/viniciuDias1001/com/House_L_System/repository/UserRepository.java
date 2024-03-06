package github.io.viniciuDias1001.com.House_L_System.repository;

import github.io.viniciuDias1001.com.House_L_System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);

    Optional<User> findByEmail(String email);
}