package org.apache.ibatis.test.constants;

/**
 * 性别
 */
public enum SexEnum {
    MAN(0, "男"),
    WOMAN(1, "女"),
    UNKONOW(2, "未知");

    private int code;

    private String desc;

    SexEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
