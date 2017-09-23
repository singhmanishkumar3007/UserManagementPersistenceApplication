package com.easybusiness.modelmanagement.usergroupmap;

import java.util.List;

import com.easybusiness.modelmanagement.entity.UserGroupMap;

public interface UserGroupMapCustomRepository {

    UserGroupMap getUserGroupMapById(Long mappingId);

    void deleteUserGroupMap(Long mappingId);

    void updateUserGroupMap(UserGroupMap userGroupMap);

    void addUserGroupMap(UserGroupMap userGroupMap);

    List<UserGroupMap> getAllUserGroupMaps();

}
