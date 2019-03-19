/**
 * FileName: LazySimpleSingleton
 * Author:   84235
 * Date:     2019/3/18 15:16
 * Description: DESCRIPTION
 */
package com.study.pattern.lazy;

/**
 *
 * @author xhb
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazy = null;
    public synchronized  static  LazySimpleSingleton getInstatnce(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return  lazy;
    }
}
