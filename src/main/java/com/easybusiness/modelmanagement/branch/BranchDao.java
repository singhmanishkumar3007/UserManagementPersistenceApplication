package com.easybusiness.modelmanagement.branch;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.Bank;
import com.easybusiness.modelmanagement.entity.Branch;

@Component
public class BranchDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(BranchDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    BranchRepository branchRepository;

    @Transactional(readOnly = true)
    public List<Branch> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<Branch> branchList = new ArrayList<Branch>();
	for (Branch branch : branchRepository.findAll()) {
	    LOGGER.info("Branch : " + branch);
	    branchList.add(branch);

	}
	return branchList;

    }

    @Transactional(readOnly = true)
    public List<Branch> findByBank(Bank bank) {
	for (Branch branch : branchRepository.findByBank(bank)) {
	    LOGGER.info("Branch : " + branch);
	}
	return branchRepository.findByBank(bank);
    }

    @Transactional(readOnly = true)
    public Branch findBranchById(Long id) {
	for (Branch Branch : branchRepository.findById(id)) {
	    LOGGER.info("Branch : " + Branch);
	}
	return branchRepository.findById(id).get(0);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addBranch(Branch branch) {
	branchRepository.addBranch(branch);
	LOGGER.info("Branch added successfully " + branch.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteBranch(Long branchId) {
	branchRepository.deleteBranch(branchId);
	LOGGER.info("Branch with id " + branchId + " deleted successfully ");
    }
    
    @Transactional(readOnly = true)
    public List<Branch> findBranchByBankId(Bank bank) {
	return branchRepository.findByBank(bank);
    }

}
