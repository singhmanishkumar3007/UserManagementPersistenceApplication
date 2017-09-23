package com.easybusiness.modelmanagement.userrolemap;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.easybusiness.modelmanagement.entity.UserRoleMap;

@Transactional
@Repository
public class UserRoleMapRepositoryImpl implements UserRoleMapCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UserRoleMap getUserRoleMapById(Long userRoleMapId) {
	return entityManager.find(UserRoleMap.class, userRoleMapId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<UserRoleMap> getAllUserRoleMaps() {
	String hql = "FROM UserRoleMap as userRoleMap ORDER BY userRoleMap.id";
	return (List<UserRoleMap>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public void addUserRoleMap(UserRoleMap userRoleMap) {
	entityManager.merge(userRoleMap);
    }

    @Override
    public void updateUserRoleMap(UserRoleMap userRoleMap) {
	UserRoleMap userRoleMapItem = getUserRoleMapById(userRoleMap.getId());
	/*
	 * menu.setTitle(Menu.getTitle()); menu.setCategory(Menu.getCategory());
	 */
	entityManager.flush();
    }

    @Override
    public void deleteUserRoleMap(Long userRoleMapId) {
	entityManager.remove(getUserRoleMapById(userRoleMapId));
    }

}
