package com.easybusiness.modelmanagement.submenu;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Menu;
import com.easybusiness.modelmanagement.entity.SubMenu;

public interface SubMenuRepository extends CrudRepository<SubMenu, Long>, SubMenuCustomRepository {

    List<SubMenu> findById(Long i);

    List<SubMenu> findByMenu(Menu menu);

}
