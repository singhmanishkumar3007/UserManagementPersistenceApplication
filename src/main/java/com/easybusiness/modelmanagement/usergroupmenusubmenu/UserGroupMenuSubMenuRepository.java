package com.easybusiness.modelmanagement.usergroupmenusubmenu;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Menu;
import com.easybusiness.modelmanagement.entity.SubMenu;
import com.easybusiness.modelmanagement.entity.UserGroup;
import com.easybusiness.modelmanagement.entity.UserGroupMenuSubMenu;

public interface UserGroupMenuSubMenuRepository
	extends CrudRepository<UserGroupMenuSubMenu, Long>, UserGroupMenuSubMenuCustomRepository {

    List<UserGroupMenuSubMenu> findById(Long i);

    List<UserGroupMenuSubMenu> findByUserGroup(UserGroup userGroup);

    List<UserGroupMenuSubMenu> findByMenuItem(Menu menu);
    
    List<UserGroupMenuSubMenu> findBySubMenuItem(SubMenu subMenu);
    
    List<UserGroupMenuSubMenu> findByUserGroupAndSubMenuItem(UserGroup userGroup,SubMenu subMenu);

}
