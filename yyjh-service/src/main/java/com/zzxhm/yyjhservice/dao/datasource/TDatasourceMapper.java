package com.zzxhm.yyjhservice.dao.datasource;

import com.zzxhm.yyjhservice.domain.datasource.TDatasource;
import org.springframework.stereotype.Repository;

@Repository
public interface TDatasourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDatasource record);

    int insertSelective(TDatasource record);

    TDatasource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDatasource record);

    int updateByPrimaryKey(TDatasource record);
}