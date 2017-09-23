package com.easybusiness.modelmanagement.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.easybusiness.modelmanagement.entity.UserImage;

@Transactional
@Repository
public class UserImageRepositoryImpl implements UserImageCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUserImage(UserImage userImage) {
	entityManager.merge(userImage);

    }

    @Override
    public List<UserImage> getAllUserImages() {
	// TODO Auto-generated method stub
	return null;
    }

}
