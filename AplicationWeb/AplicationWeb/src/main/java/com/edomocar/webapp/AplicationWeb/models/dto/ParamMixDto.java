package com.edomocar.webapp.AplicationWeb.models.dto;

public class ParamMixDto {
    private String name;
    private Integer code;

    public ParamMixDto() {
    }

    public ParamMixDto(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
