package com.sca.order.pojo;

import lombok.Data;

@Data
public class RequestResult {
    private  String msg;
    private  Integer code;
    private  Object object;

    public RequestResult(String msg, Integer code, Object object) {
        this.msg = msg;
        this.code = code;
        this.object = object;
    }
    public static RequestResult ok()
    {
        return new RequestResult("请求成功",200,null);
    }
    public static RequestResult ok(String msg,Object object)
    {
        return new RequestResult(msg,200,object);
    }
    public static RequestResult ok(String msg)
    {
        return new RequestResult(msg,200,null);
    }
    public static RequestResult error(String msg)
    {
        return  new RequestResult(msg,500,null);
    }
}
