package org.wlf.entity;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {
    private int id;
    private String name;
    private int projectid;
    private int roleid;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
