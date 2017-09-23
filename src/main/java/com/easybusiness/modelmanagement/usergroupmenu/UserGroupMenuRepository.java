package com.easybusiness.modelmanagement.usergroupmenu;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Menu;
import com.easybusiness.modelmanagement.entity.UserGroup;
import com.easybusiness.modelmanagement.entity.UserGroupMenu;

public interface UserGroupMenuRepository extends CrudRepository<UserGroupMenu, Long>, UserGroupMenuCustomRepository {

    List<UserGroupMenu> findById(Long i);

    List<UserGroupMenu> findByUserGroup(UserGroup userGroup);

    List<UserGroupMenu> findByMenuItem(Menu menu);
    
    List<UserGroupMenu> findByUserGroupAndMenuItem(UserGroup userGroup,Menu menu);

}
