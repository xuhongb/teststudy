/**
 * FileName: LazyInnerClassSingleton
 * Author:   84235
 * Date:     2019/3/18 15:27
 * Description: DESCRIPTION
 */
package com.study.pattern.lazy;

/**
 *
 * @author xhb
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY !=null){
            throw  new  RuntimeException("不允许创建多个实例");
        }
    }

    public  static  LazyInnerClassSingleton getInstance(){
        return  LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
