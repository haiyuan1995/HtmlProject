package Data;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

/**
 * 用户头像类
 */
public class Person extends BmobObject {

    private BmobFile pictureFile;
    private MyUser userName;

    public MyUser getUserName() {
        return userName;
    }

    public void setUserName(MyUser userName) {
        this.userName = userName;
    }

    public BmobFile getPictureFile() {
        return pictureFile;
    }

    public void setPictureFile(BmobFile pictureFile) {
        this.pictureFile = pictureFile;
    }

}