package designPatterns.creational.singleton.breakingSingletonPattern.reflectionAPIs;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        /*UserBean object1 = UserBean.createUserObject();
        UserBean object2 = UserBean.createUserObject();
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());*/


        System.out.println("---------------Reflection APIs-------------");

        Constructor<?> refObject1 = UserBean.class.getDeclaredConstructor();
        refObject1.setAccessible(true);
        UserBean reflectionObject = (UserBean) refObject1.newInstance();
        System.out.println(reflectionObject.hashCode());

        Constructor<?> refObject2 = UserBean.class.getDeclaredConstructor();
        refObject2.setAccessible(true);
        UserBean reflectionObject1 = (UserBean) refObject2.newInstance();
        System.out.println(reflectionObject1.hashCode());
    }
}
