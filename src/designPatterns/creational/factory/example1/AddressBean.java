package designPatterns.creational.factory.example1;

public class AddressBean {

    private int addressId;
    private String houseNo;
    private String street;
    private String area;
    private String city;
    private String state;
    private String country;
    private String pinCode;

    private static volatile AddressBean addressBean = null;

    private AddressBean() {
    }

    public static AddressBean getInstance() {

        if (addressBean == null) {
            synchronized (AddressBean.class) {
                if (addressBean == null) {
                    return addressBean = new AddressBean();
                }
            }

        }
        return addressBean;
    }


    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
