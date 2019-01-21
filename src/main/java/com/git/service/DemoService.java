package com.git.service;

import com.git.bean.Demo;
import com.git.dao.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangquan07
 * 2019/1/21 21:09
 */
@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;

    public Demo get(Integer id) {
        return demoMapper.get(id);
    }
}
