package org.wlf.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.wlf.entity.UserEntity;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 获取user表格数据
     * @return  List<UserEntity>
     */
    @Select("SELECT * from user")
    List<UserEntity> getUserUrl();

}
