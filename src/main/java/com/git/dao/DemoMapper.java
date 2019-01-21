package com.git.dao;

import com.git.bean.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author wangquan07
 *         2019/1/21 21:13
 */
@Component
@Mapper
public interface DemoMapper {
    @Select("select * from demo where id = #{id}")
    Demo get(@Param("id") Integer id);
}
