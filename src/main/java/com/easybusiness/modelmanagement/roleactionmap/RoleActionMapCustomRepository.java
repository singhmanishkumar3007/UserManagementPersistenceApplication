package com.easybusiness.modelmanagement.roleactionmap;

import java.util.List;

import com.easybusiness.modelmanagement.entity.RoleActionMap;

public interface RoleActionMapCustomRepository {

    RoleActionMap getRoleActionMapById(Long mappingId);

    void deleteRoleActionMap(Long mappingId);

    void updateRoleActionMap(RoleActionMap roleActionMap);

    void addRoleActionMap(RoleActionMap roleActionMap);

    List<RoleActionMap> getAllRoleActionMaps();

}
