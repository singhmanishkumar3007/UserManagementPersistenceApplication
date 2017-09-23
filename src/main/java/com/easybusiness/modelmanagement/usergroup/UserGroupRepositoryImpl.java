package com.easybusiness.modelmanagement.usergroup;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.easybusiness.modelmanagement.entity.UserGroup;

@Transactional
@Repository
public class UserGroupRepositoryImpl implements UserGroupCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UserGroup getUserGroupById(Long userGroupId) {
	return entityManager.find(UserGroup.class, userGroupId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<UserGroup> getAllUserGroups() {
	String hql = "FROM UserGroup as userGroup ORDER BY userGroup.id";
	return (List<UserGroup>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public void addUserGroup(UserGroup userGroup) {
	entityManager.persist(userGroup);
    }

    @Override
    public void updateUserGroup(UserGroup userGroup) {
	UserGroup userGroupItem = getUserGroupById(userGroup.getId());
	/*
	 * menu.setTitle(Menu.getTitle()); menu.setCategory(Menu.getCategory());
	 */
	entityManager.flush();
    }

    @Override
    public void deleteUserGroup(Long userGroupId) {
	entityManager.remove(getUserGroupById(userGroupId));
    }

}
