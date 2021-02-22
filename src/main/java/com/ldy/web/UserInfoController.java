package com.ldy.web;

import io.micrometer.core.instrument.Metrics;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户信息相关接口")
@RequestMapping()
@Slf4j
public class UserInfoController {

    @Autowired
    sss userInfoService;


    Log log1 = LogFactory.getLog(UserInfoController.class);

    @GetMapping("resource")
    @ApiOperation("获取用户的资源权限列表")
    public String getResourceList() {

    int i=    Metrics.globalRegistry.getRegistries().size();
log1.info("ddss");
        log1.info("ddss");
        return "ssdghrss";
    }
}
