package com.easybusiness.modelmanagement.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserImage;

public interface UserImageRepository extends CrudRepository<UserImage, Long>, UserImageCustomRepository {

    List<UserImage> findById(Long i);

    List<UserImage> findByUser(User user);

}
