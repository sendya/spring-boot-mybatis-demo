package com.loacg.entity;

/**
 * Project: spring-boot-mybatis
 * Author: Sendya <18x@loacg.com>
 * Date: 2017/4/19 15:02
 */
public class Data {

    private int error = -1;

    private Object data;

    private String message = "Request failed";

    public Data() {

    }

    public Data(int error, String message) {
        this.error = error;
        this.message = message;
    }

    public Data(int error, String message, Object data) {
        this.error = error;
        this.message = message;
        this.data = data;
    }

    public static Data build() {
        return new Data();
    }

    public static Data build(int error, String message) {
        return new Data(error, message);
    }

    public int getError() {
        return error;
    }

    public Data setError(int error) {
        this.error = error;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Data setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Data setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Data{" +
                "error=" + error +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
