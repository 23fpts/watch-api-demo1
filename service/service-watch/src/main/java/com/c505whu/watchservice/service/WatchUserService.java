package com.c505whu.watchservice.service;

import com.c505whu.watchservice.entity.WatchUser;
import com.c505whu.watchservice.mapper.WatchUserMapper;
import com.thc.servicebase.exceptionhandler.MyException;
import com.thc.servicebase.exceptionhandler.MyExceptionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author thc
 * @Title:
 * @Package com.c505whu.watchservice.service
 * @Description:
 * @date 2020/10/5 7:16 下午
 */
@Service
public class WatchUserService {

    @Autowired
    private WatchUserMapper userMapper;


    public List<WatchUser> query() {
        return userMapper.selectList(null);
    }

    public void add(WatchUser watchUser) {
        userMapper.insert(watchUser);
    }

    public void delete(Integer id) {
        if (userMapper.selectById(id)==null) {
            throw new MyException(MyExceptionType.USER_INPUT_ERROR.getCode(), "不存在");
        }
        userMapper.deleteById(id);
    }

    public void update(WatchUser watchUser) {
        userMapper.updateById(watchUser);
    }

}
