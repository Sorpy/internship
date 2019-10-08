package data.entity.model.account;

import data.entity.model.persistentModel.Persistent;
import data.entity.model.status.UserStatus;

public class User extends Persistent {
    private String username;
    private String password;
    private UserStatus userStatus;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }
}
