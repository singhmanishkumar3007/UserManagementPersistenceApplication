package com.easybusiness.modelmanagement.department;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Department;
import com.easybusiness.modelmanagement.entity.Organization;

public interface DepartmentRepository extends CrudRepository<Department, Long>, DepartmentCustomRepository {

    List<Department> findById(Long i);

    List<Department> findByOrganization(Organization organization);
    
    List<Department> findByDeptName(String deptName);

}
