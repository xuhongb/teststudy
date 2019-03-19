/**
 * FileName: SeriableSingleton
 * Author:   84235
 * Date:     2019/3/19 15:17
 * Description: DESCRIPTION
 */
package com.study.pattern.seriable;

import java.io.Serializable;

/**
 *
 * @author xhb
 */
public class SeriableSingleton implements Serializable {
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }
}
