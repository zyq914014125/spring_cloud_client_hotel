package com.hqyj.traveluser.permission.service.Impl;

import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.entity.Permission;
import com.hqyj.traveluser.permission.dao.PermissionMapper;
import com.hqyj.traveluser.permission.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/16
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public Permission getPermByPermId(int permissionId) {
        return permissionMapper.getPermByPermId(permissionId);
    }

    @Override
    public Result<Permission> addPerm(Permission permission) {
        Permission permission1 = permissionMapper.getPermByPermName(permission.getPermissionName());
        if (permission1 != null) {
            return new Result<Permission>(Result.ResultState.ERROR_RESPONSE, "permissionName is repeate!");
        }

        permissionMapper.addPerm(permission);
        return new Result<Permission>(Result.ResultState.SUCCESS_RESPONSE, "Insert permission success!", permission);
    }

    @Override
    public Result<Permission> updatePerm(Permission permission) {
        Permission permission1 = permissionMapper.getPermByPermName(permission.getPermissionName());
        if (permission1 != null && permission1.getPermissionId() != permission.getPermissionId()) {
            return new Result<Permission>(
                    Result.ResultState.ERROR_RESPONSE, "permissionName is repeate!");
        }
        permissionMapper.updatePerm(permission);
        return new Result<Permission>(
                Result.ResultState.SUCCESS_RESPONSE, "Update Permission success", permission);
    }

    @Override
    public Result<Object> deletePerm(int permId) {
        permissionMapper.deletePerm(permId);
        return new Result<Object>(Result.ResultState.SUCCESS_RESPONSE,"delete permission success!");
    }
}
