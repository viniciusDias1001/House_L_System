package github.io.viniciuDias1001.com.House_L_System.entity;

import github.io.viniciuDias1001.com.House_L_System.Enum.TaskStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Column(length = 25)
    private String name;

    @NotNull
    @NotBlank
    @Column(length = 100)
    private String description;

    @NotNull
    private Integer priority;

    @NotNull
    private TaskStatus taskStatus;

}
