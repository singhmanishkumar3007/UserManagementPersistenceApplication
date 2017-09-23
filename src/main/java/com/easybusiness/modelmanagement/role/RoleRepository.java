package com.easybusiness.modelmanagement.role;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.easybusiness.modelmanagement.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long>, RoleCustomRepository {

    List<Role> findById(Long i);

    List<Role> findByRole(String roleName);

    // custom query example and return a stream
    @Query("select r from Role r where r.role = :roleName")
    Stream<Role> findByRoleReturnStream(@Param("roleName") String roleName);

}
