package com.easybusiness.modelmanagement.roleactionmap;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.Role;
import com.easybusiness.modelmanagement.entity.RoleActionMap;

@Component
public class RoleActionMapDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleActionMapDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    RoleActionMapRepository roleActionMapRepository;

    @Transactional(readOnly = true)
    public List<RoleActionMap> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<RoleActionMap> roleActionMapList = new ArrayList<RoleActionMap>();
	for (RoleActionMap roleActionMap : roleActionMapRepository.findAll()) {
	    LOGGER.info("RoleActionMap : " + roleActionMap);
	    roleActionMapList.add(roleActionMap);

	}
	return roleActionMapList;

    }

    @Transactional(readOnly = true)
    public List<RoleActionMap> findByRole(Role role) {
	for (RoleActionMap roleActionMap : roleActionMapRepository.findByRole(role)) {
	    LOGGER.info("RoleActionMap : " + roleActionMap);
	}
	return roleActionMapRepository.findByRole(role);
    }

    @Transactional(readOnly = true)
    public RoleActionMap findRoleActionMapById(Long id) {
	for (RoleActionMap roleActionMap : roleActionMapRepository.findById(id)) {
	    LOGGER.info("RoleActionMap : " + roleActionMap);
	}
	return roleActionMapRepository.findById(id).get(0);
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void addRoleActionMap(RoleActionMap roleActionMap) {
	roleActionMapRepository.addRoleActionMap(roleActionMap);
	LOGGER.info("RoleActionMap added successfully " + roleActionMap.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteRoleActionMap(Long roleActionMapId) {
	roleActionMapRepository.deleteRoleActionMap(roleActionMapId);
	LOGGER.info("RoleActionMap with id " + roleActionMapId + " deleted successfully ");
    }

}
