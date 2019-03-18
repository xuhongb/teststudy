/**
 * FileName: JavaWebCourseFactory
 * Author:   84235
 * Date:     2019/3/18 13:55
 * Description: DESCRIPTION
 */
package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.ICourse;
import com.study.pattern.factory.JavaWebCourse;

/**
 *
 * @author xhb
 */
public class JavaWebCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaWebCourse();
    }
}
