package com.easybusiness.modelmanagement.submenuurl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.SubMenu;
import com.easybusiness.modelmanagement.entity.SubMenuUrl;

public interface SubMenuUrlRepository extends CrudRepository<SubMenuUrl, Long>, SubMenuUrlCustomRepository {

    List<SubMenuUrl> findById(Long i);

    List<SubMenuUrl> findBySubMenu(SubMenu subMenu);

}
