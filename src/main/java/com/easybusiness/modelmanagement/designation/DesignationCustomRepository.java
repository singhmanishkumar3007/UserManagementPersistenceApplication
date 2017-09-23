package com.easybusiness.modelmanagement.designation;

import java.util.List;

import com.easybusiness.modelmanagement.entity.Designation;

public interface DesignationCustomRepository {

    Designation getDesignationById(Long id);

    void deleteDesignation(Long id);

    void updateDesignation(Designation designation);

    void addDesignation(Designation designation);

    List<Designation> getAllDesignations();

}
