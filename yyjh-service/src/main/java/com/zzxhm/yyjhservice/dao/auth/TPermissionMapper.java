package com.zzxhm.yyjhservice.dao.auth;

import com.zzxhm.yyjhservice.domain.auth.TPermission;
import org.springframework.stereotype.Repository;

@Repository
public interface TPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPermission record);

    int insertSelective(TPermission record);

    TPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TPermission record);

    int updateByPrimaryKey(TPermission record);
}