package com.easybusiness.modelmanagement.bank;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Bank;

public interface BankRepository extends CrudRepository<Bank, Long>, BankCustomRepository {

    List<Bank> findById(long id);

    List<Bank> findByBankName(String bankName);

    

}
