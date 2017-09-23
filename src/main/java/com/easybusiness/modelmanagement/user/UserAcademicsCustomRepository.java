package com.easybusiness.modelmanagement.user;

import java.util.List;

import com.easybusiness.modelmanagement.entity.UserAcademics;

public interface UserAcademicsCustomRepository {


    void addUserAcademics(UserAcademics userAcademics);

    List<UserAcademics> getAllUserAcademics();
    
    void updateUserAcademics(UserAcademics userAcademics);

}
