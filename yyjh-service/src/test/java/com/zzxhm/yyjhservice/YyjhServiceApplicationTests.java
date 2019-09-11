package com.zzxhm.yyjhservice;

import com.zzxhm.yyjhservice.config.jedis.JedisUtil;
import com.zzxhm.yyjhservice.dao.user.TUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YyjhServiceApplicationTests {
    @Autowired
    private JedisUtil jedisUtil;

    @Autowired
    private TUserMapper tUserMapper;

    @Test
    public void contextLoads() {
        System.out.println(jedisUtil.get("key-ztt"));
    }

    @Test
    public void testMybatis() {
        System.out.println(tUserMapper.selectByPrimaryKey(1).getNickname());
    }



}
