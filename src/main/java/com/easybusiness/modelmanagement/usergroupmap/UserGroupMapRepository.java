package com.easybusiness.modelmanagement.usergroupmap;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserGroup;
import com.easybusiness.modelmanagement.entity.UserGroupMap;

public interface UserGroupMapRepository extends CrudRepository<UserGroupMap, Long>, UserGroupMapCustomRepository {

    List<UserGroupMap> findById(Long i);

    List<UserGroupMap> findByUser(User user);
    
    List<UserGroupMap> findByUserGroup(UserGroup userGroup);
    
    List<UserGroupMap> findByUserAndUserGroup(User user,UserGroup userGroup);

}
