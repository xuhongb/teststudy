/**
 * FileName: HungrySinleton
 * Author:   84235
 * Date:     2019/3/19 14:06
 * Description: DESCRIPTION
 */
package com.study.pattern.hungry;

/**
 *
 * @author xhb
 */
public class HungrySinleton {
    private HungrySinleton(){};
    private static final HungrySinleton intance = new HungrySinleton();

    private static  HungrySinleton getInstance(){
        return  intance;
    }
}
