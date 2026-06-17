package designPatterns.creational.singleton;

import java.io.Serializable;

public class UserBean {

    private long id;
    private String name;
    private String address;
    private String phone;

    private static volatile UserBean userBean;

    private UserBean(){

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

}
