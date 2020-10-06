package com.c505whu.watchservice.service;

import com.c505whu.watchservice.entity.WatchData;
import com.c505whu.watchservice.mapper.WatchDataMapper;
import com.thc.servicebase.exceptionhandler.MyException;
import com.thc.servicebase.exceptionhandler.MyExceptionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author thc
 * @Title:
 * @Package com.c505whu.watchservice.service
 * @Description:
 * @date 2020/10/6 10:50 上午
 */
@Service
public class WatchDataService {

    @Autowired
    private WatchDataMapper watchDataMapper;

    public List<WatchData> query() {
        return watchDataMapper.selectList(null);
    }

    @Transactional
    public void add(WatchData watchData) {
        watchDataMapper.insert(watchData);
    }

    @Transactional
    public void update(WatchData watchData) {
        if (watchDataMapper.selectById(watchData.getId())==null) {
            throw new MyException(MyExceptionType.USER_INPUT_ERROR.getCode(), "不存在");
        }
        watchDataMapper.updateById(watchData);
    }

    public void delete(Integer id) {
        if (watchDataMapper.selectById(id)==null) {
            throw new MyException(MyExceptionType.USER_INPUT_ERROR.getCode(), "不存在");
        }
        watchDataMapper.deleteById(id);
    }
}
