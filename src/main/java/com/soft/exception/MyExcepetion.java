package com.soft.exception;

/**
 * Created by Administrator on 2020/2/13.
 */
public class MyExcepetion extends Exception {

    private String errorMsg;

    public MyExcepetion() {
    }

    public MyExcepetion(String errorMsg) {

        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "MyExcepetion{" +
                "errorMsg='" + errorMsg + '\'' +
                '}';
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
