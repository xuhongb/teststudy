/**
 * FileName: QiTianDaSheng
 * Author:   84235
 * Date:     2019/3/20 10:48
 * Description: DESCRIPTION
 */
package com.study.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 *
 * @author xhb
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {
    public JiGuBang jiGuBang;

    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jiGuBang = new JiGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(bos);
            os.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }
}
