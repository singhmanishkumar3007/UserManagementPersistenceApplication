package com.easybusiness.modelmanagement.user;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserProfession;

@Component
public class UserProfessionDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserProfessionDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    UserProfessionRepository userProfessionRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUserProfession(UserProfession userProfession) {
	userProfessionRepository.addUserProfession(userProfession);
	LOGGER.info("User Profession added successfully " + userProfession.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public UserProfession getUserProfession(User user) {
	return userProfessionRepository.findByUser(user).get(0);

    }
    

    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUserProfession(UserProfession userProfession) {
	userProfessionRepository.updateUserProfession(userProfession);
	LOGGER.info("User Profession updated successfully " + userProfession.toString());
    }

}
