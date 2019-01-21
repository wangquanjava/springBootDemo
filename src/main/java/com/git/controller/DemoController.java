package com.git.controller;

import com.git.bean.BaseResponse;
import com.git.bean.Demo;
import com.git.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangquan07
 * 2019/1/21 16:53
 */
@RestController
public class DemoController {
    @Value("${http.url}")
    private String url;
    @Autowired
    private DemoService demoService;

    @RequestMapping("/getUrl")
    public BaseResponse getUrl() {
        return BaseResponse.successData(url);
    }
    @RequestMapping("/get")
    public BaseResponse get(Integer id) {
        Demo demo = demoService.get(id);
        return BaseResponse.successData(demo);
    }
}
