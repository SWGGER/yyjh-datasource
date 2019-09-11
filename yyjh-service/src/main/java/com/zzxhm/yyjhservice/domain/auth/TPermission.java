package com.zzxhm.yyjhservice.domain.auth;

import lombok.Data;

import java.util.Date;

@Data
public class TPermission {
    private Integer id;

    private String permission;

    private String state;

    private Date createTime;

    private Date updateTime;


}