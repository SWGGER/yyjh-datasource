package com.zzxhm.yyjhservice.dao.auth;

import com.zzxhm.yyjhservice.domain.auth.TUserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface TUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserRole record);

    int insertSelective(TUserRole record);

    TUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserRole record);

    int updateByPrimaryKey(TUserRole record);
}