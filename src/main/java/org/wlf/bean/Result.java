package org.wlf.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JSONType(orders={"code","message","data"})
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result(T data) {
        this(RespEnum.SUCCESS.getCode(),RespEnum.SUCCESS.getDesc(),data);
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this, SerializerFeature.WriteMapNullValue);
    }
}
