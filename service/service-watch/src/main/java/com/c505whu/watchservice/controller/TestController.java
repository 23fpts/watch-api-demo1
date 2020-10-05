package com.c505whu.watchservice.controller;

import com.thc.commonutils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thc
 * @Title:
 * @Package com.c505whu.watchservice.controller
 * @Description:
 * @date 2020/10/5 7:06 下午
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("test")
    public R test() {
        return R.ok();
    }

}
