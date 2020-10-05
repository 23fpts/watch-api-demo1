package com.c505whu.watchservice.controller;

import com.c505whu.watchservice.entity.WatchUser;
import com.c505whu.watchservice.service.WatchUserService;
import com.thc.commonutils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author thc
 * @Title:
 * @Package com.c505whu.watchservice.controller
 * @Description:
 * @date 2020/10/5 7:26 下午
 */
@RestController
@RequestMapping("watchuser")
public class WatchUserController {
    @Autowired
    private WatchUserService userService;

    @GetMapping("query")
    public R query() {
        return R.ok().data(userService.query());
    }

    @PostMapping("add")
    public R add(@RequestBody WatchUser watchUser) {
        userService.add(watchUser);
        return R.ok();
    }

    @PostMapping("delete")
    public R delete(@RequestParam("id") Integer id) {
        userService.delete(id);
        return R.ok();
    }

    @PostMapping("update")
    public R update(@RequestBody WatchUser watchUser) {
        userService.update(watchUser);
        return R.ok();
    }
}
