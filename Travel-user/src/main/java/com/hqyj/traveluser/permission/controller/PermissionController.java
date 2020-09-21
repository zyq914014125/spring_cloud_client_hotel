package com.hqyj.traveluser.permission.controller;

import com.hqyj.TravelSpringBoot.module.Serach.Result;

import com.hqyj.TravelSpringBoot.module.entity.Permission;
import com.hqyj.TravelSpringBoot.module.entity.User;
import com.hqyj.traveluser.permission.service.PermissionService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/16
 */

@RequestMapping("/api")
@RestController
public class PermissionController {
    @Autowired
    private PermissionService permissionService;


    /**
     * 127.0.0.1:8150/api/perms/1 ---- get
     */
    @GetMapping("/perms/{permissionId}")
    public Permission getUserByUserId(@PathVariable int permissionId) {
        return permissionService.getPermByPermId(permissionId);
    }

    /**
     *127.0.0.1:8150/api/perms---post
     * {"permissionName":"管理员"}
     */
    @PostMapping(value = "/perms",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Permission> addPerm(@RequestBody Permission permission){
        return permissionService.addPerm(permission);
    }

    /**
     *127.0.0.1:8150/api/perms----put
     * {"permissionName":"经理","permissionId":4}
     */
    @PutMapping(value = "/perms",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Permission> updatePerm(@RequestBody Permission permission){
        return permissionService.updatePerm(permission);
    }

    /**
     *127.0.0.1:8150/api/perms/6----delete
     *
     */
    @DeleteMapping(value = "/perms/{permissionId}")
    public Result<Object> deletePerm(@PathVariable int permissionId){
        return permissionService.deletePerm(permissionId);
    }

}
