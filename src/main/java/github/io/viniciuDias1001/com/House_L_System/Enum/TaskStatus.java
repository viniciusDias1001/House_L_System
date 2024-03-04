package github.io.viniciuDias1001.com.House_L_System.Enum;

public enum TaskStatus {

    PENDING("PENDING"),
    DONE("DONE");

    private String status;

    TaskStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
