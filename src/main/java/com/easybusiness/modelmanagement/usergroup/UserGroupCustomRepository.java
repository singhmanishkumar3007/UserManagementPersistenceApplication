package com.easybusiness.modelmanagement.usergroup;

import java.util.List;

import com.easybusiness.modelmanagement.entity.UserGroup;

public interface UserGroupCustomRepository {

    UserGroup getUserGroupById(Long id);

    void deleteUserGroup(Long usergroupId);

    void updateUserGroup(UserGroup userGroup);

    void addUserGroup(UserGroup userGroup);

    List<UserGroup> getAllUserGroups();

}
