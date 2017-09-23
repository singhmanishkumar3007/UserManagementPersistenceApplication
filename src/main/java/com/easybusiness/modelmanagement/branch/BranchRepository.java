package com.easybusiness.modelmanagement.branch;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Bank;
import com.easybusiness.modelmanagement.entity.Branch;

public interface BranchRepository extends CrudRepository<Branch, Long>, BranchCustomRepository {

    List<Branch> findById(long id);

    List<Branch> findByBank(Bank bank);

}
