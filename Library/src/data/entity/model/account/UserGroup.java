package data.entity.model.account;

import data.entity.model.persistentModel.Persistent;
import data.entity.model.status.UserGroupStatus;

public class UserGroup extends Persistent {
    private UserGroupStatus userGroupStatus;

    public UserGroupStatus getUserGroupStatus() {
        return userGroupStatus;
    }

    public void setUserGroupStatus(UserGroupStatus userGroupStatus) {
        this.userGroupStatus = userGroupStatus;
    }
}
