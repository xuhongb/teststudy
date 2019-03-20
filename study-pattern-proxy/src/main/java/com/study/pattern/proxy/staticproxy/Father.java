/**
 * FileName: Father
 * Author:   84235
 * Date:     2019/3/20 13:42
 * Description: DESCRIPTION
 */
package com.study.pattern.proxy.staticproxy;

import com.study.pattern.proxy.Person;

/**
 *
 * @author xhb
 */
public class Father implements Person {
    private Son person;

    public Father(Son person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("找好人选！");
        this.person.findLove();
        System.out.println("确定人！");
    }
}
