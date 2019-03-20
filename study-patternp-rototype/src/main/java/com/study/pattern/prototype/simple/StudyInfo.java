/**
 * FileName: StudyInfo
 * Author:   84235
 * Date:     2019/3/20 10:39
 * Description: DESCRIPTION
 */
package com.study.pattern.prototype.simple;

import java.util.List;

/**
 *
 * @author xhb
 */
public class StudyInfo implements Cloneable {
    private String name;
    private String addr;
    private List<String> phos;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public List<String> getPhos() {
        return phos;
    }

    public void setPhos(List<String> phos) {
        this.phos = phos;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
