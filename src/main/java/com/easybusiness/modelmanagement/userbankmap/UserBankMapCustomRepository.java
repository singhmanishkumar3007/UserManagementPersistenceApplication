package com.easybusiness.modelmanagement.userbankmap;

import java.util.List;

import com.easybusiness.modelmanagement.entity.UserBankMap;

public interface UserBankMapCustomRepository {

    UserBankMap getUserBankMapById(Long id);

    void deleteUserBankMap(Long id);

    void updateUserBankMap(UserBankMap userBankMap);

    void addUserBankMap(UserBankMap userBankMap);

    List<UserBankMap> getAllUserBankMaps();

}
