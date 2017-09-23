package com.easybusiness.modelmanagement.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.easybusiness.modelmanagement.entity.UserProfession;

@Transactional
@Repository
public class UserProfessionRepositoryImpl implements UserProfessionCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUserProfession(UserProfession userProfession) {
	entityManager.merge(userProfession);

    }

    @Override
    public List<UserProfession> getAllUserProfessions() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void updateUserProfession(UserProfession userProfession) {
	entityManager.merge(userProfession);
	
    }

}
