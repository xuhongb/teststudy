/**
 * FileName: ContainerSingleton
 * Author:   84235
 * Date:     2019/3/19 14:27
 * Description: DESCRIPTION
 */
package com.study.pattern.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author xhb
 */
public class ContainerSingleton {
    private ContainerSingleton (){}
    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    public static  Object getInstance(String className){
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object object = null;
                try {
                    object = Class.forName(className).newInstance();
                    ioc.put(className,object);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return object;
            }
            else {
                return ioc.get(className);
            }
        }
    }
}
