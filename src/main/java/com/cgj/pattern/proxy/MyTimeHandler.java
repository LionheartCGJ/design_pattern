package com.cgj.pattern.proxy;

import java.lang.reflect.Method;

public class MyTimeHandler implements MyInvocationHandler {

    private Object target;

    public MyTimeHandler(Object target) {
        super();
        this.target = target;
    }

    /**
     * 参数： proxy：被代理的对象 method：被代理的方法 args：被代理方法的参数
     */
    @Override
    public Object invoke(Object proxy, Method method) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行使...");
        method.invoke(target);
        System.out.println("汽车行驶结束...");
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶时间：" + (endTime - startTime) + "毫秒");
        return null;
    }

}
