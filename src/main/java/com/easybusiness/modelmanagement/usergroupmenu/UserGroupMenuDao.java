package com.easybusiness.modelmanagement.usergroupmenu;

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
import com.easybusiness.modelmanagement.entity.UserGroupMenu;

@Component
public class UserGroupMenuDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserGroupMenuDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    UserGroupMenuRepository userGroupMenuRepository;

    @Transactional(readOnly = true)
    public List<UserGroupMenu> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<UserGroupMenu> UserGroupMenuList = new ArrayList<UserGroupMenu>();
	for (UserGroupMenu userGroupMenu : userGroupMenuRepository.findAll()) {
	    LOGGER.info("UserGroupMenu : " + userGroupMenu);
	    UserGroupMenuList.add(userGroupMenu);

	}
	return UserGroupMenuList;

    }

    @Transactional(readOnly = true)
    public UserGroupMenu findUserGroupMenuById(Long id) {
	for (UserGroupMenu userGroupMenu : userGroupMenuRepository.findById(id)) {
	    LOGGER.info("UserGroupMenu : " + userGroupMenu);
	}
	return userGroupMenuRepository.findById(id).get(0);
    }
    
    @Transactional(readOnly = true)
    public List<UserGroupMenu> findUserGroupMenuByUserGroup(UserGroup userGroup) {
	for (UserGroupMenu userGroupMenu : userGroupMenuRepository.findByUserGroup(userGroup)) {
	    LOGGER.info("UserGroupMenu : " + userGroupMenu);
	}
	return userGroupMenuRepository.findByUserGroup(userGroup);
	
    }
    
    @Transactional(readOnly = true)
    public List<UserGroupMenu> findUserGroupMenuByMenu(Menu menu) {
	for (UserGroupMenu userGroupMenu : userGroupMenuRepository.findByMenuItem(menu)) {
	    LOGGER.info("UserGroupMenu : " + userGroupMenu);
	}
	return userGroupMenuRepository.findByMenuItem(menu);
	
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUserGroupMenu(UserGroupMenu userGroupMenu) {
	if (userGroupMenuRepository.findByUserGroupAndMenuItem(userGroupMenu.getUserGroup(),userGroupMenu.getMenuItem()).size()>0){
	    userGroupMenu.setId(userGroupMenuRepository.findByUserGroupAndMenuItem(userGroupMenu.getUserGroup(),userGroupMenu.getMenuItem()).get(0).getId());
	}
	userGroupMenuRepository.addUserGroupMenu(userGroupMenu);
	LOGGER.info("UserGroupMenu added successfully " + userGroupMenu.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUserGroupMenu(Long userGroupMenuId) {
	userGroupMenuRepository.deleteUserGroupMenu(userGroupMenuId);
	LOGGER.info("UserGroupMenu with id " + userGroupMenuId + " deleted successfully ");
    }

}
