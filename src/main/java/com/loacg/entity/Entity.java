package com.loacg.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Project: spring-boot-mybatis
 * Author: liangliang.Yin <yinliangliang@rd.keytop.com.cn>
 * Date: 2017/4/19 16:38
 */
public class Entity {

    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;

    @JsonIgnore
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonIgnore
    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

}
