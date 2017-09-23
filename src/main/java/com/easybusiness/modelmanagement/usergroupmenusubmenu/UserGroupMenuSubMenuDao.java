package com.easybusiness.modelmanagement.usergroupmenusubmenu;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.Menu;
import com.easybusiness.modelmanagement.entity.UserGroup;
import com.easybusiness.modelmanagement.entity.UserGroupMenuSubMenu;

@Component
public class UserGroupMenuSubMenuDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserGroupMenuSubMenuDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    UserGroupMenuSubMenuRepository userGroupSubMenuRepository;

    @Transactional(readOnly = true)
    public List<UserGroupMenuSubMenu> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<UserGroupMenuSubMenu> UserGroupMenuList = new ArrayList<UserGroupMenuSubMenu>();
	for (UserGroupMenuSubMenu userGroupMenu : userGroupSubMenuRepository.findAll()) {
	    LOGGER.info("UserGroupMenu : " + userGroupMenu);
	    UserGroupMenuList.add(userGroupMenu);

	}
	return UserGroupMenuList;

    }

    @Transactional(readOnly = true)
    public UserGroupMenuSubMenu findUserGroupMenuById(Long id) {
	for (UserGroupMenuSubMenu userGroupMenu : userGroupSubMenuRepository.findById(id)) {
	    LOGGER.info("UserGroupMenu : " + userGroupMenu);
	}
	return userGroupSubMenuRepository.findById(id).get(0);
    }

    @Transactional(readOnly = true)
    public List<UserGroupMenuSubMenu> findUserGroupMenuByUserGroup(UserGroup userGroup) {
	for (UserGroupMenuSubMenu userGroupMenu : userGroupSubMenuRepository.findByUserGroup(userGroup)) {
	    LOGGER.info("UserGroupMenuSubMenu : " + userGroupMenu.toString());
	}
	return userGroupSubMenuRepository.findByUserGroup(userGroup);

    }

    @Transactional(readOnly = true)
    public List<UserGroupMenuSubMenu> findUserGroupMenuByMenu(Menu menu) {
	for (UserGroupMenuSubMenu userGroupMenu : userGroupSubMenuRepository.findByMenuItem(menu)) {
	    LOGGER.info("UserGroupMenu : " + userGroupMenu);
	}
	return userGroupSubMenuRepository.findByMenuItem(menu);

    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUserGroupMenu(UserGroupMenuSubMenu userGroupMenu) {
	if (userGroupSubMenuRepository.findByUserGroupAndSubMenuItem(userGroupMenu.getUserGroup(),userGroupMenu.getSubMenuItem()).size()>0){
	    userGroupMenu.setId(userGroupSubMenuRepository.findByUserGroupAndSubMenuItem(userGroupMenu.getUserGroup(),userGroupMenu.getSubMenuItem()).get(0).getId());
	}
	userGroupSubMenuRepository.addUserGroupMenu(userGroupMenu);
	LOGGER.info("UserGroupMenu added successfully " + userGroupMenu.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUserGroupMenu(Long userGroupMenuId) {
	userGroupSubMenuRepository.deleteUserGroupMenu(userGroupMenuId);
	LOGGER.info("UserGroupMenu with id " + userGroupMenuId + " deleted successfully ");
    }

}
