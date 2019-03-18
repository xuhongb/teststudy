/**
 * FileName: FactoryMethodTest
 * Author:   84235
 * Date:     2019/3/18 13:57
 * Description: DESCRIPTION
 */
package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.ICourse;

/**
 *
 * @author xhb
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaWebCourseFactory();
        ICourse iCourse = factory.create();
        iCourse.record();
    }
}
