package github.io.viniciuDias1001.com.House_L_System.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import github.io.viniciuDias1001.com.House_L_System.Enum.TaskStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;


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
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "A data não pode ser nula")
    private LocalDate dateCrated;



}
