package github.io.viniciuDias1001.com.House_L_System.repository;

import github.io.viniciuDias1001.com.House_L_System.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface  HouseRepository extends JpaRepository<House, Long> {
    Optional<House> findByName(String name);
}
