/**
 * FileName: LazyDoubleCheckSingleton
 * Author:   84235
 * Date:     2019/3/18 15:19
 * Description: DESCRIPTION
 */
package com.study.pattern.lazy;

/**
 *
 * @author xhb
 */
public class LazyDoubleCheckSingleton {
    private volatile  static  LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton(){}
    public static  LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazy ==null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return  lazy;
    }
}
