/**
 * FileName: ThreadLocalSingleton
 * Author:   84235
 * Date:     2019/3/19 15:32
 * Description: DESCRIPTION
 */
package com.study.pattern.threadlocal;

/**
 *
 * @author xhb
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };
    private ThreadLocalSingleton(){}

    public static  ThreadLocalSingleton getInstance(){
        return  threadLocalSingleton.get();
    }
}
