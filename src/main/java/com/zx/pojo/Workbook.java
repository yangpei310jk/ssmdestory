package com.zx.pojo;


public class Workbook {
    private Integer id;

    private String code;

    private String describe;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }


    @Override
    public String toString() {
        return "Workbook{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", describe='" + describe + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}