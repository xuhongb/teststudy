/**
 * FileName: AbstractFactoryTest
 * Author:   84235
 * Date:     2019/3/18 14:11
 * Description: DESCRIPTION
 */
package com.study.pattern.factory.abstractfactory;

/**
 *
 * @author xhb
 */
public class AbstractFactoryTest  {
    public static void main(String[] args) {
        CourseFactory factory = new JavaWebCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
