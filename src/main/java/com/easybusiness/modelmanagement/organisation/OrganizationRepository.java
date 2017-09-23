package com.easybusiness.modelmanagement.organisation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.modelmanagement.entity.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, Long>, OrganizationCustomRepository {

    List<Organization> findById(Long i);

    List<Organization> findByOrgName(String organizationName);

}
