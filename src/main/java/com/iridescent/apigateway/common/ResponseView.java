package com.iridescent.apigateway.common;

import java.io.Serializable;

/**
 * Description:
 *
 * @author 陌北有棵树
 * @version 2019/3/13
 */
public class ResponseView implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final int OK = 0;
    public static final int OK_NOT_LOGIN = 1;
    public static final int OK_NOT_AUTH = 2;
    public static final int EXCEPTION_IGNORE = -1;
    public static final int EXCEPTION_WINDOW_SHOW = -2;
    public static final int EXCEPTION_TOAST_SHOW = -3;
    public static final int SOURCE_NOT_EXIST = -10;
    public static final int EXCEPTION_WINDOW_REFRESH_SHOW = -4;
    private int code = 0;
    private String message = "ok";
    private Object result;
    private String uuid;

    public ResponseView() {
        this.code = 0;
        this.message = "ok";
    }

    public ResponseView(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public ResponseView(int code, String msg, String uuid) {
        this.code = code;
        this.message = msg;
        this.uuid = uuid;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object result) {
        this.result = result;
    }



}
