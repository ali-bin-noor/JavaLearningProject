package designPatterns.creational.singleton.breakingSingletonPattern.cloningMethod;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class UserBean implements Serializable, Cloneable {

    private long id;
    private String name;
    private String address;
    private String phone;

    private static volatile UserBean userBean;

    private UserBean(){

        if (userBean != null){
            throw new RuntimeException("Object already created! please use that object or use createUserObject()");
        }

    }

    public static UserBean createUserObject(){
        if (userBean == null){
           synchronized (UserBean.class){
               if (userBean == null){
                   return userBean = new UserBean();
               }
           }
        }
        return userBean;
    }

    public Object readResolve() throws ObjectStreamException {
        return createUserObject();
    }


    @Override
    public Object clone() {
        return userBean;
    }
}
