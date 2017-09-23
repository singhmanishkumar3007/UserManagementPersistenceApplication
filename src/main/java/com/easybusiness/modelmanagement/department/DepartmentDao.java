package com.easybusiness.modelmanagement.department;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.modelmanagement.entity.Department;
import com.easybusiness.modelmanagement.entity.Organization;
import com.easybusiness.modelmanagement.organisation.OrganizationDao;

@Component
public class DepartmentDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    DepartmentRepository departmentRepository;
    
    @Autowired
    OrganizationDao organizationDao;

    @Transactional(readOnly = true)
    public List<Department> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<Department> departmentList = new ArrayList<Department>();
	for (Department department: departmentRepository.findAll()) {
	    LOGGER.info("Department : " + department);
	    departmentList.add(department);

	}
	return departmentList;

    }

    @Transactional(readOnly = true)
    public Department findByDepartmentName(String deptName) {
	for (Department department : departmentRepository.findByDeptName(deptName)) {
	    LOGGER.info("Department : " + department);
	}
	return departmentRepository.findByDeptName(deptName).get(0);
    }

    @Transactional(readOnly = true)
    public Department findDepartmentById(Long id) {
	for (Department department : departmentRepository.findById(id)) {
	    LOGGER.info("Department : " + department);
	}
	return departmentRepository.findById(id).get(0);
    }
    
    @Transactional(readOnly = true)
    public List<Department> findDepartmentByOrgId(Long orgId) {
	Organization organization=organizationDao.findOrganizationById(orgId);
	return departmentRepository.findByOrganization(organization);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addDepartment(Department department) {
	departmentRepository.addDepartment(department);
	LOGGER.info("Department added successfully " + department.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteDepartment(Long id) {
	departmentRepository.deleteDepartment(id);
	LOGGER.info("Department with id " + id + " deleted successfully ");
    }

}
