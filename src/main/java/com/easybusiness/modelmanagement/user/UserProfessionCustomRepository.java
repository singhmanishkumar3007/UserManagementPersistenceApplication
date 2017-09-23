package com.easybusiness.modelmanagement.user;

import java.util.List;

import com.easybusiness.modelmanagement.entity.UserProfession;

public interface UserProfessionCustomRepository {


    void addUserProfession(UserProfession userProfession);

    List<UserProfession> getAllUserProfessions();
    
    void updateUserProfession(UserProfession userProfession);

}
