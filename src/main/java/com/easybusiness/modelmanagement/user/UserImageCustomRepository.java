package com.easybusiness.modelmanagement.user;

import java.util.List;

import com.easybusiness.modelmanagement.entity.UserImage;

public interface UserImageCustomRepository {


    void addUserImage(UserImage userImage);

    List<UserImage> getAllUserImages();

}
