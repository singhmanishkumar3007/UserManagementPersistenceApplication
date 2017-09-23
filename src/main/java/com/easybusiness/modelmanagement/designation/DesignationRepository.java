package com.easybusiness.modelmanagement.designation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Designation;

public interface DesignationRepository extends CrudRepository<Designation, Long>, DesignationCustomRepository {

    List<Designation> findById(Long i);

    List<Designation> findByDesig(String desigName);

}
