/**
 * FileName: Girl
 * Author:   84235
 * Date:     2019/3/20 15:03
 * Description: DESCRIPTION
 */
package com.study.pattern.proxy.dynamicproxy.jdkproxy;

import com.study.pattern.proxy.Person;

/**
 *
 * @author xhb
 */
public class Girl implements Person {
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
