package org.wlf.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wlf.entity.UserEntity;
import org.wlf.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author momo
 */
@Service
@Slf4j
public class UserService {
    @Resource
    UserMapper userMapper;

    public List<UserEntity> getData() {
        List<UserEntity> userInfo = null;
        try {
            userInfo = userMapper.getUserUrl();
        } catch (Exception e) {
            log.error("select user table error! {}", e.toString());
            return null;
        }
        return userInfo;
    }
}
