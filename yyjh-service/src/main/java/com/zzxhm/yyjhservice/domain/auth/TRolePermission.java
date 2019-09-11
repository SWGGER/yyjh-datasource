package com.zzxhm.yyjhservice.domain.auth;

import lombok.Data;

@Data
public class TRolePermission {
    private Integer id;

    private Integer roleId;

    private Integer permissionId;

}