package com.zzxhm.yyjhservice.domain.user;

import lombok.Data;

import java.util.Date;

@Data
public class TUser {
    private Integer id;

    private String loginid;

    private String password;

    private String nickname;

    private String userimg;

    private String email;

    private String tel;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private String state;

}