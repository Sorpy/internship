package data.entity;

public class AccountClientStatus extends NamedPersistent {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
