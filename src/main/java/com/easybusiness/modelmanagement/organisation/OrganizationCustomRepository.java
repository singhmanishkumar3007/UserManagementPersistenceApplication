package com.easybusiness.modelmanagement.organisation;

import java.util.List;

import com.easybusiness.modelmanagement.entity.Organization;

public interface OrganizationCustomRepository {

    Organization getOrganizationById(Long id);

    boolean organizationExists(Long id, String orgName);

    void deleteOrganization(Long id);

    void updateOrganization(Organization organization);

    void addOrganization(Organization organization);

    List<Organization> getAllOrganizations();

}
