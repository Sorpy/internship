package business.processor.usergroupprocessor;

import business.converter.usergroup.UserGroupResult;
import business.converter.usersusergroup.UsersUserGroupParam;

import java.util.List;

public interface UserGroupProcessor {
    UserGroupResult create(UsersUserGroupParam param);
    List<UserGroupResult> create(List<UsersUserGroupParam> param);

    void update(long id,UsersUserGroupParam param);
    void update(List<UsersUserGroupParam> param);

    void delete(long id);
    void delete(List<Long> idList);

    UserGroupResult find(long id);
    List<UserGroupResult> find();
}
