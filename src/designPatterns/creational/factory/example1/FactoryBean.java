package designPatterns.creational.factory.example1;

public class FactoryBean {

    public static Object getInstanceObject(String beanName) {

        if (beanName == null) {
            return null;
        }

        switch (beanName.toLowerCase()) {

            case "address":
                return AddressBean.getInstance();

            case "user":
                return UserBean.getInstance();

            default:
                throw new IllegalArgumentException("No such bean: " + beanName);
        }

    }

}
