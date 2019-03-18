/**
 * FileName: BigDataCourseFactory
 * Author:   84235
 * Date:     2019/3/18 13:56
 * Description: DESCRIPTION
 */
package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.BigDataCourse;
import com.study.pattern.factory.ICourse;

/**
 *
 * @author xhb
 */
public class BigDataCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new BigDataCourse();
    }
}
