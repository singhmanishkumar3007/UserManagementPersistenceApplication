package com.easybusiness.modelmanagement.approvermaster;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.ApproverMaster;
import com.easybusiness.modelmanagement.entity.User;
import com.easybusiness.modelmanagement.user.UserDao;

@Component
public class ApproverMasterDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApproverMasterDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    ApproverMasterRepository approverMasterRepository;
    
    @Autowired
    UserDao userDao;

	

    @Transactional(readOnly = true)
    public List<ApproverMaster> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<ApproverMaster> approverMasterList = new ArrayList<ApproverMaster>();
	for (ApproverMaster approverMaster : approverMasterRepository.findAll()) {
	    LOGGER.info("ApproverMaster : " + approverMaster);
	    approverMasterList.add(approverMaster);

	}
	return approverMasterList;

    }

    @Transactional(readOnly = true)
    public List<ApproverMaster> findByTaskId(Long taskId) {

	return approverMasterRepository.findById(taskId);
    }

    @Transactional(readOnly = true)
    public ApproverMaster findApproverMasterByTaskDesc(String taskDesc) {

	return approverMasterRepository.findByTaskDesc(taskDesc).get(0);
    }
    
    @Transactional(readOnly = true)
    public List<ApproverMaster> findApproverAuthoritiesOfUser(String userId) {

	User user=userDao.findUserById(Long.parseLong(userId));
	return approverMasterRepository.findAll(ApproverMasterSpecifications.findIfUserIsAnyApprover(user));
    }
    
    @Transactional(readOnly = true)
    public Boolean findIfUserIsApproverForTaskId(String userId,String taskId) {

	try{
	User user=userDao.findUserById(Long.parseLong(userId));
	List<ApproverMaster> approverListForATask=approverMasterRepository.findAll(ApproverMasterSpecifications.findIfUserIsAnyApproverOfParticularTask(user, taskId));
	return (approverListForATask.size()>0);
	}
	catch(Exception e)
	{
	    LOGGER.error("exception while findIfUserIsApproverForTaskId for user Id{},task Id{} is {}",userId,taskId,e.getMessage() );
	    return false;
	}
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addApproverMaster(ApproverMaster approverMaster) {
	approverMasterRepository.addApproverMaster(approverMaster);
	LOGGER.info("ApproverMaster added successfully " + approverMaster.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteApproverMaster(Long approverMasterId) {
	approverMasterRepository.deleteApproverMaster(approverMasterId);
	LOGGER.info("ApproverMaster with id " + approverMasterId + " deleted successfully ");
    }

}
