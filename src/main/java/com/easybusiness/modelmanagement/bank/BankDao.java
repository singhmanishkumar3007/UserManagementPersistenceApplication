package com.easybusiness.modelmanagement.bank;

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

@Component
public class BankDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    BankRepository bankRepository;

    @Transactional(readOnly = true)
    public List<Bank> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<Bank> bankList = new ArrayList<Bank>();
	for (Bank bank : bankRepository.findAll()) {
	    LOGGER.info("Bank : " + bank);
	    bankList.add(bank);

	}
	return bankList;

    }

    @Transactional(readOnly = true)
    public List<Bank> findByBankName(String bankName) {
	for (Bank bank : bankRepository.findByBankName(bankName)) {
	    LOGGER.info("Bank : " + bank);
	}
	return bankRepository.findByBankName(bankName);
    }

    @Transactional(readOnly = true)
    public Bank findBankById(Long id) {
	for (Bank bank : bankRepository.findById(id)) {
	    LOGGER.info("Bank : " + bank);
	}
	return bankRepository.findById(id).get(0);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addBank(Bank bank) {
	bankRepository.addBank(bank);
	LOGGER.info("Bank added successfully " + bank.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteBank(Long bankId) {
	bankRepository.deleteBank(bankId);
	LOGGER.info("Bank with id " + bankId + " deleted successfully ");
    }

}
