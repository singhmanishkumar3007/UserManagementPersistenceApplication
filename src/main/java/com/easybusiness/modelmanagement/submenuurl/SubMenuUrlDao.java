package com.easybusiness.modelmanagement.submenuurl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.SubMenu;
import com.easybusiness.modelmanagement.entity.SubMenuUrl;

@Component
public class SubMenuUrlDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(SubMenuUrlDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    SubMenuUrlRepository subMenuUrlRepository;

    @Transactional(readOnly = true)
    public List<SubMenuUrl> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<SubMenuUrl> subMenuList = new ArrayList<SubMenuUrl>();
	for (SubMenuUrl subMenu : subMenuUrlRepository.findAll()) {
	    LOGGER.info("SubMenuUrl : " + subMenu);
	    subMenuList.add(subMenu);

	}
	return subMenuList;

    }

    @Transactional(readOnly = true)
    public SubMenuUrl findBySubMenu(SubMenu subMenu) {
	for (SubMenuUrl subMenuUrl : subMenuUrlRepository.findBySubMenu(subMenu)) {
	    LOGGER.info("SubMenuUrl : " + subMenuUrl);
	}
	return subMenuUrlRepository.findBySubMenu(subMenu).get(0);
    }

    @Transactional(readOnly = true)
    public SubMenuUrl findSubMenuUrlById(Long id) {
	for (SubMenuUrl subMenu : subMenuUrlRepository.findById(id)) {
	    LOGGER.info("SubMenuUrl : " + subMenu);
	}
	return subMenuUrlRepository.findById(id).get(0);
    }

}
