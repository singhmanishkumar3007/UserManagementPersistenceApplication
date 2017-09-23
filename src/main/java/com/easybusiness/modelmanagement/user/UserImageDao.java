package com.easybusiness.modelmanagement.user;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserImage;

@Component
public class UserImageDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserImageDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    UserImageRepository userImageRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUserImage(UserImage userImage) {
	userImageRepository.addUserImage(userImage);
	LOGGER.info("User added successfully " + userImage.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public UserImage getUserImage(User user) {
	return userImageRepository.findByUser(user).get(0);

    }

}
