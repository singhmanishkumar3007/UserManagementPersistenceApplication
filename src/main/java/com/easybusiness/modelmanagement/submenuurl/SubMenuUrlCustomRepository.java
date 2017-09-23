package com.easybusiness.modelmanagement.submenuurl;

import java.util.List;

import com.easybusiness.modelmanagement.entity.SubMenuUrl;

public interface SubMenuUrlCustomRepository {

    SubMenuUrl getSubMenuUrlById(Long menuId);

    void deleteSubMenuUrl(Long MenuId);

    void updateSubMenuUrl(SubMenuUrl subMenu);

    void addSubMenuUrl(SubMenuUrl subMenu);

    List<SubMenuUrl> getAllSubMenuUrls();

}
