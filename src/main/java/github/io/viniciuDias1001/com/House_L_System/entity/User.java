package github.io.viniciuDias1001.com.House_L_System.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import github.io.viniciuDias1001.com.House_L_System.Enum.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "User")
public class User {


    /*
    USUÁRIO POSSUI
    email
    nome
    Password
    idade(data de nasc)
    genero
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Column(length = 25)
    private String name;

    @NotNull
    @NotBlank
    @Column(length = 50)
    private String password;

    @NotNull
    @Column
    @NotBlank
    @JsonFormat(pattern = "dd/MM/yyyy")
    private String birthdate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
