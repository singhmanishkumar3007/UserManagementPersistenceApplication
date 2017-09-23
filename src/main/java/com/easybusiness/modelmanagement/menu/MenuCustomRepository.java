package com.easybusiness.modelmanagement.menu;

import java.util.List;

import com.easybusiness.modelmanagement.entity.Menu;

public interface MenuCustomRepository {


    Menu getMenuById(Long menuId);

    boolean MenuExists(String title, String category);

    void deleteMenu(Long MenuId);

    void updateMenu(Menu Menu);

    void addMenu(Menu Menu);

    List<Menu> getAllMenus();

}
