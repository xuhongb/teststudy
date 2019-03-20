/**
 * FileName: ConcretePrototype
 * Author:   84235
 * Date:     2019/3/20 10:26
 * Description: DESCRIPTION
 */
package com.study.pattern.prototype.simple;

import java.util.List;

/**
 *
 * @author xhb
 */
public class ConcretePrototype implements Prototyppe {
    private int age;
    private String name;
    private List<String> hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setHobbies(this.hobbies);
        return concretePrototype;
    }
}
