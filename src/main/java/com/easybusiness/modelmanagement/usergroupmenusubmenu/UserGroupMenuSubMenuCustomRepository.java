package com.easybusiness.modelmanagement.usergroupmenusubmenu;

import java.util.List;

import com.easybusiness.modelmanagement.entity.UserGroupMenuSubMenu;

public interface UserGroupMenuSubMenuCustomRepository {

    UserGroupMenuSubMenu getUserGroupMenuById(Long id);

    void deleteUserGroupMenu(Long userGroupMenuId);

    void updateUserGroupMenu(UserGroupMenuSubMenu userGroupMenu);

    void addUserGroupMenu(UserGroupMenuSubMenu userGroupMenu);

    List<UserGroupMenuSubMenu> getAllUserGroupMenus();

}
