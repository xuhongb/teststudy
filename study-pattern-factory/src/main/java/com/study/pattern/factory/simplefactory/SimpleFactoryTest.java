/**
 * FileName: SimpleFactoryTest
 * Author:   84235
 * Date:     2019/3/18 13:34
 * Description: DESCRIPTION
 */
package com.study.pattern.factory.simplefactory;

import com.study.pattern.factory.BigDataCourse;
import com.study.pattern.factory.ICourse;
import com.study.pattern.factory.JavaWebCourse;

/**
 *
 * @author xhb
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
       /* ICourse icourse = new JavaWebCourse();
        icourse.record();*/

//       CourseFactory factory = new CourseFactory();
//       ICourse iCourse = factory.create("com.study.pattern.factory.JavaWebCourse");
//       iCourse.record();
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(BigDataCourse.class);
        course.record();

    }
}
