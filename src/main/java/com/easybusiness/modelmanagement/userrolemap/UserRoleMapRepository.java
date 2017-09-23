package com.easybusiness.modelmanagement.userrolemap;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Role;
import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserRoleMap;

public interface UserRoleMapRepository extends CrudRepository<UserRoleMap, Long>, UserRoleMapCustomRepository {

    List<UserRoleMap> findById(Long i);

    List<UserRoleMap> findByUser(User user);
    
    List<UserRoleMap> findByRole(Role role);

}
