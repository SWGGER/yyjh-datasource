package com.zzxhm.yyjhservice.domain.auth;

import lombok.Data;

import java.util.Date;

@Data
public class TRole {
    private Integer id;

    private String rolename;

    private String roledesc;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private String state;
}