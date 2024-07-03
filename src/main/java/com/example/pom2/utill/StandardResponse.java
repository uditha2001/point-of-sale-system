package com.example.pom2.utill;

public class StandardResponse {
    private int code;
    private String message;
    private Object data;

    public StandardResponse() {
    }

    public StandardResponse(String message, int code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
