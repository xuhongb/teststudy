/**
 * FileName: CourseFactory
 * Author:   84235
 * Date:     2019/3/18 11:27
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
public class CourseFactory {
//    public ICourse create(String name){
//        if("bigData".equals(name)){
//            return  new BigDataCourse();
//        }else if("javaWeb".equals(name)){
//            return  new JavaWebCourse();
//        }else{
//            return  null;
//        }
//    }

//    public ICourse create(String className){
//
//        try {
//            if(!(null == className || "".equals(className))) {
//                return (ICourse) Class.forName(className).newInstance();
//            }
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return  null;
//    }

    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if(null != clazz){
                return  clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }
}
