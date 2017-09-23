package com.easybusiness.modelmanagement.userbankmap;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.Bank;
import com.easybusiness.modelmanagement.entity.Branch;
import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserBankMap;

@Component
public class UserBankMapDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserBankMapDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    UserBankMapRepository userBankMapRepository;

    @Transactional(readOnly = true)
    public List<UserBankMap> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<UserBankMap> userBankMapList = new ArrayList<UserBankMap>();
	for (UserBankMap userBankMap : userBankMapRepository.findAll()) {
	    LOGGER.info("UserBankMap : " + userBankMap);
	    userBankMapList.add(userBankMap);

	}
	return userBankMapList;

    }

    @Transactional(readOnly = true)
    public List<UserBankMap> findByUser(User user) {
	for (UserBankMap userBankMap : userBankMapRepository.findByUser(user)) {
	    LOGGER.info("UserBankMap : " + userBankMap);
	}
	return userBankMapRepository.findByUser(user);
    }
    
    @Transactional(readOnly = true)
    public List<UserBankMap> findByBank(Bank bank) {
	for (UserBankMap userBankMap : userBankMapRepository.findByBank(bank)) {
	    LOGGER.info("UserBankMap : " + userBankMap);
	}
	return userBankMapRepository.findByBank(bank);
    }
    
    @Transactional(readOnly = true)
    public List<UserBankMap> findByBranch(Branch branch) {
	for (UserBankMap userBankMap : userBankMapRepository.findByBranch(branch)) {
	    LOGGER.info("UserBankMap : " + userBankMap);
	}
	return userBankMapRepository.findByBranch(branch);
    }


    @Transactional(readOnly = true)
    public UserBankMap findUserBankMapById(Long id) {
	for (UserBankMap userBankMap : userBankMapRepository.findById(id)) {
	    LOGGER.info("UserBankMap : " + userBankMap);
	}
	return userBankMapRepository.findById(id).get(0);
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void addUserBankMap(UserBankMap userBankMap) {
	if(userBankMapRepository.findByUser(userBankMap.getUser()).size()>0)
	{
	    userBankMap.setId(userBankMapRepository.findByUser(userBankMap.getUser()).get(0).getId()); 
	}
	userBankMapRepository.addUserBankMap(userBankMap);
	LOGGER.info("UserBankMap added successfully " + userBankMap.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUserBankMap(Long userBankMapId) {
	userBankMapRepository.deleteUserBankMap(userBankMapId);
	LOGGER.info("UserBankMap with id " + userBankMapId + " deleted successfully ");
    }

}
