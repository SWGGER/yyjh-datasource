package com.zzxhm.yyjhservice.domain.datasource;

import lombok.Data;

import java.util.Date;

@Data
public class TDatasource {
    private Integer id;

    private String userId;

    private String type;

    private Date createtime;

    private Date updatetime;

    private String databaseName;

    private String alias;

    private String driver;

    private String url;

    private Integer port;

    private String auth;

    private String username;

    private String password;

    private String description;

    private String encode;

}