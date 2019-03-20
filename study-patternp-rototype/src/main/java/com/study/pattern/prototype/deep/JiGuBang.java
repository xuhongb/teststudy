/**
 * FileName: JiGuBang
 * Author:   84235
 * Date:     2019/3/20 10:47
 * Description: DESCRIPTION
 */
package com.study.pattern.prototype.deep;

import java.io.Serializable;

/**
 *
 * @author xhb
 */
public class JiGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
