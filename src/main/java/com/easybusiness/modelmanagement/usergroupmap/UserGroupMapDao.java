package com.easybusiness.modelmanagement.usergroupmap;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserGroup;
import com.easybusiness.modelmanagement.entity.UserGroupMap;

@Component
public class UserGroupMapDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserGroupMapDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    UserGroupMapRepository userGroupMapRepository;

    @Transactional(readOnly = true)
    public List<UserGroupMap> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<UserGroupMap> UserGroupMapList = new ArrayList<UserGroupMap>();
	for (UserGroupMap UserGroupMap : userGroupMapRepository.findAll()) {
	    LOGGER.info("UserGroupMap : " + UserGroupMap);
	    UserGroupMapList.add(UserGroupMap);

	}
	return UserGroupMapList;

    }

    @Transactional(readOnly = true)
    public List<UserGroupMap> findByUser(User user) {
	for (UserGroupMap UserGroupMap : userGroupMapRepository.findByUser(user)) {
	    LOGGER.info("UserGroupMap : " + UserGroupMap);
	}
	return userGroupMapRepository.findByUser(user);
    }

    @Transactional(readOnly = true)
    public UserGroupMap findUserGroupMapById(Long id) {
	for (UserGroupMap UserGroupMap : userGroupMapRepository.findById(id)) {
	    LOGGER.info("UserGroupMap : " + UserGroupMap);
	}
	return userGroupMapRepository.findById(id).get(0);
    }

    @Transactional(readOnly = true)
    public List<UserGroupMap> findUserGroupMapByGroupId(UserGroup userGroup) {
	for (UserGroupMap UserGroupMap : userGroupMapRepository.findByUserGroup(userGroup)) {
	    LOGGER.info("UserGroupMap : " + UserGroupMap);
	}
	return userGroupMapRepository.findByUserGroup(userGroup);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUserGroupMap(UserGroupMap userGroupMap) {

	LOGGER.info("in dao for mapping user group to user");
	LOGGER.info("size is " + userGroupMapRepository.findByUser(userGroupMap.getUser()).size());
	if (userGroupMapRepository.findByUser(userGroupMap.getUser()).size() > 0) {
	    userGroupMap.setId(userGroupMapRepository.findByUser(userGroupMap.getUser()).get(0).getId());
	}
	userGroupMapRepository.addUserGroupMap(userGroupMap);
	LOGGER.info("UserGroupMap added successfully " + userGroupMap.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUserGroupMap(Long UserGroupMapId) {
	userGroupMapRepository.deleteUserGroupMap(UserGroupMapId);
	LOGGER.info("UserGroupMap with id " + UserGroupMapId + " deleted successfully ");
    }

}
