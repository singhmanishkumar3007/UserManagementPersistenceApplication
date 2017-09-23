package com.easybusiness.modelmanagement.userbankmap;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Bank;
import com.easybusiness.modelmanagement.entity.Branch;
import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.entity.UserBankMap;

public interface UserBankMapRepository extends CrudRepository<UserBankMap, Long>, UserBankMapCustomRepository {

    List<UserBankMap> findById(Long i);

    List<UserBankMap> findByBank(Bank bank);
    
    List<UserBankMap> findByBranch(Branch branch);
    
    List<UserBankMap> findByUser(User user);

}
