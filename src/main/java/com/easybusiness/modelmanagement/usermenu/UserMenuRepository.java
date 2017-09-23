package com.easybusiness.modelmanagement.usermenu;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.UserGroupMap;
import com.easybusiness.modelmanagement.entity.UserMenu;

public interface UserMenuRepository extends CrudRepository<UserMenu, Long>, UserMenuCustomRepository {

    List<UserMenu> findById(Long i);

    List<UserMenu> findByUserGroupMap(UserGroupMap userGroupMap);

}
