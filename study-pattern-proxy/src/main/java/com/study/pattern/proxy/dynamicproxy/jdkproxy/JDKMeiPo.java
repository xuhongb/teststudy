/**
 * FileName: JDKMeiPo
 * Author:   84235
 * Date:     2019/3/20 15:05
 * Description: DESCRIPTION
 */
package com.study.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author xhb
 */
public class JDKMeiPo implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target)throws Exception{

        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }

}
