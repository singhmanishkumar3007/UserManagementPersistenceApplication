package com.easybusiness.modelmanagement.usermenu;

import java.util.List;

import com.easybusiness.modelmanagement.entity.UserMenu;

public interface UserMenuCustomRepository {

    UserMenu getUserMenuById(Long id);

    void deleteUserMenu(Long userMenuId);

    void updateUserMenu(UserMenu userMenu);

    void addUserMenu(UserMenu userMenu);

    List<UserMenu> getAllUserMenus();

}
