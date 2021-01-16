package org.wlf.bean;

public enum RespEnum {

    SUCCESS(900200, "成功");

    private final int code;
    private final String desc;

    RespEnum(final int code, final String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


}
