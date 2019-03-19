/**
 * FileName: HungryStaticSingleton
 * Author:   84235
 * Date:     2019/3/19 14:09
 * Description: DESCRIPTION
 */
package com.study.pattern.hungry;

/**
 *
 * @author xhb
 */
public class HungryStaticSingleton {
    private static  final  HungryStaticSingleton HUNGRY_STATIC_SINGLETON;
    static {
        HUNGRY_STATIC_SINGLETON = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    private  static HungryStaticSingleton getInstance(){
        return  HUNGRY_STATIC_SINGLETON;
    }
}
