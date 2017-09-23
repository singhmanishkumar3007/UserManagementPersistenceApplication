package com.easybusiness.modelmanagement.usergroup;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.easybusiness.modelmanagement.entity.UserGroup;

public interface UserGroupRepository extends CrudRepository<UserGroup, Long>, UserGroupCustomRepository {

    List<UserGroup> findById(Long i);

    List<UserGroup> findByUserGroupName(String userGroupName);

    // custom query example and return a stream
    @Query("select r from UserGroup r where r.userGroupName = :userGroupName")
    Stream<UserGroup> findByUserGroupNameReturnStream(@Param("userGroupName") String userGroupName);

}
