package com.easybusiness.modelmanagement.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserProfession;

public interface UserProfessionRepository extends CrudRepository<UserProfession, Long>, UserProfessionCustomRepository {

    List<UserProfession> findById(Long i);

    List<UserProfession> findByUser(User user);

}
