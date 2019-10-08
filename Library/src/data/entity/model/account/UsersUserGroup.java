package data.entity.model.account;

import data.entity.model.persistentModel.Persistent;

public class UsersUserGroup extends Persistent {
    private User user;
    private UserGroup userGroup;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }
}
