package com.c505whu.watchservice.controller;

import com.c505whu.watchservice.entity.WatchData;
import com.c505whu.watchservice.service.WatchDataService;
import com.thc.commonutils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author thc
 * @Title:
 * @Package com.c505whu.watchservice.controller
 * @Description:
 * @date 2020/10/6 10:53 上午
 */
@RestController
@RequestMapping("watchdata")
@CrossOrigin
public class WatchDataController {

    @Autowired
    private WatchDataService watchDataService;

    @GetMapping("query")
    public R query() {
        return R.ok().data(watchDataService.query());
    }


    @PostMapping("add")
    public R add(@RequestBody WatchData watchData) {
        watchDataService.add(watchData);
        return R.ok();
    }

    @PostMapping("update")
    public R update(@RequestBody WatchData watchData) {
        watchDataService.update(watchData);
        return R.ok();
    }

    @PostMapping("delete")
    public R delete(@RequestParam(value = "id", required = true) Integer id) {
        watchDataService.delete(id);
        return R.ok();
    }
}
