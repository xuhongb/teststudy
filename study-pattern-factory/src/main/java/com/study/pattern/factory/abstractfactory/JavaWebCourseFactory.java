/**
 * FileName: JavaWebCourseFactory
 * Author:   84235
 * Date:     2019/3/18 14:10
 * Description: DESCRIPTION
 */
package com.study.pattern.factory.abstractfactory;

/**
 *
 * @author xhb
 */
public class JavaWebCourseFactory implements CourseFactory {
    public INote createNote() {
        return new JavaWebNote();
    }

    public IVideo createVideo() {
        return new JavaWebVideo();
    }
}
