package com.hqyj.traveluser.permission.service;

import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.Permission;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/16
 */
public interface PermissionService {

    Permission getPermByPermId(int permissionId);

    Result<Permission> addPerm(Permission permission);

    Result<Permission> updatePerm(Permission permission);

    Result<Object> deletePerm(int permId);


}
