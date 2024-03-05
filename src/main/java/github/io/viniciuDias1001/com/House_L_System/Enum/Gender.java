package github.io.viniciuDias1001.com.House_L_System.Enum;

public enum Gender {
    Male("Male"),
    Female("Female");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
