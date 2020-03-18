package com.yarm.controller;

import com.yarm.common.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :健康检查
 * @Author : yarm.yang
 * @Date : 2020/3/18 14:26
*/
@RestController
public class HealthContr {
    @RequestMapping("/")
    public Result<String> index(){
        return new Result<>("ok");
    }
}
