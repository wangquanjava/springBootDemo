package com.git.dao;

import com.git.bean.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author wangquan07
 * 2019/1/21 21:13
 */
@Repository
@Mapper
public interface DemoMapper {
    @Select("select * from demo where id=#{id}")
    Demo get(@Param("id") Integer id);
}
