package com.easybusiness.modelmanagement.user;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserAcademics;

@Component
public class UserAcademicsDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserAcademicsDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    UserAcademicsRepository userAcademicsRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUserAcademics(UserAcademics userAcademics) {
	userAcademicsRepository.addUserAcademics(userAcademics);
	LOGGER.info("User Academics added successfully " + userAcademics.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public UserAcademics getUserAcademics(User user) {
	return userAcademicsRepository.findByUser(user).get(0);

    }
    

    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUserAcademics(UserAcademics userAcademics) {
	userAcademicsRepository.updateUserAcademics(userAcademics);
	LOGGER.info("User Academics updated successfully " + userAcademics.toString());
    }

}
