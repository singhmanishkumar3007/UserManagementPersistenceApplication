package com.easybusiness.modelmanagement.usergroupmenu;

import java.util.List;

import com.easybusiness.modelmanagement.entity.UserGroupMenu;

public interface UserGroupMenuCustomRepository {

    UserGroupMenu getUserGroupMenuById(Long id);

    void deleteUserGroupMenu(Long userGroupMenuId);

    void updateUserGroupMenu(UserGroupMenu userGroupMenu);

    void addUserGroupMenu(UserGroupMenu userGroupMenu);

    List<UserGroupMenu> getAllUserGroupMenus();

}
