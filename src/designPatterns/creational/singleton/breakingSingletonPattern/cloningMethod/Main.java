package designPatterns.creational.singleton.breakingSingletonPattern.cloningMethod;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        UserBean object1 =UserBean.createUserObject();
        UserBean object2 = (UserBean) object1.clone();

        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());

    }
}
