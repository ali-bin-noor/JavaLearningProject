package designPatterns.creational.factory.example1;

public class UserBean {

    private long id;
    private String name;
    private AddressBean address;
    private int cell;

    private static volatile UserBean userBean = null;


    private UserBean() {
    }


    public static UserBean getInstance() {

        if (userBean == null) {
            synchronized (AddressBean.class) {
                if (userBean == null) {
                    return userBean = new UserBean();
                }
            }

        }
        return userBean;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }
}
