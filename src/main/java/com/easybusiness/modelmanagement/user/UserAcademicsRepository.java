package com.easybusiness.modelmanagement.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserAcademics;

public interface UserAcademicsRepository extends CrudRepository<UserAcademics, Long>, UserAcademicsCustomRepository {

    List<UserAcademics> findById(Long i);

    List<UserAcademics> findByUser(User user);

}
