/**
 * FileName: CGlibMeiPo
 * Author:   84235
 * Date:     2019/3/20 14:56
 * Description: DESCRIPTION
 */
package com.study.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *
 * @author xhb
 */
public class CGlibMeiPo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception{
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return  enhancer.create();
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invoke(o,objects);
    }
}
