package com.easybusiness.modelmanagement.approvermaster;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.ApproverMaster;

public interface ApproverMasterRepository extends CrudRepository<ApproverMaster, Long>, ApproverMasterCustomRepository,JpaSpecificationExecutor<ApproverMaster> {

    List<ApproverMaster> findById(Long id);

    List<ApproverMaster> findByTaskDesc(String taskDesc);

    List<ApproverMaster> findAll();

}
