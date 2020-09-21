package com.hqyj.traveluser.permission.dao;

import com.hqyj.TravelSpringBoot.module.entity.Permission;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface PermissionMapper {
    @Select("select * from permission where permission_name=#{permissionName}")
    Permission getPermByPermName(String permissionName);

    @Select("select * from permission where permission_id=#{permissionId}")
    Permission getPermByPermId(int permissionId);

    @Insert("insert into permission (permission_name) value(#{permissionName})")
    void addPerm(Permission permission);

    @Update("update permission set permission_name=#{permissionName} where permission_id=#{permissionId}")
    void updatePerm(Permission permission);

    @Delete("delete from permission where permission_id=#{permissionId}")
    void deletePerm(int permissionId);

}
