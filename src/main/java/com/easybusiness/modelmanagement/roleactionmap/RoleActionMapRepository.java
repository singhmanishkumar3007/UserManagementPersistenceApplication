package com.easybusiness.modelmanagement.roleactionmap;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Role;
import com.easybusiness.modelmanagement.entity.RoleActionMap;

public interface RoleActionMapRepository extends CrudRepository<RoleActionMap, Long>, RoleActionMapCustomRepository {

    List<RoleActionMap> findById(Long i);

    List<RoleActionMap> findByRole(Role role);

}
