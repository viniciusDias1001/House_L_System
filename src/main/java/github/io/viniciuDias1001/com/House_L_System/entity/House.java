package github.io.viniciuDias1001.com.House_L_System.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class House {

    @Id
    private Long id;

    @NotNull
    private Place place;
}
