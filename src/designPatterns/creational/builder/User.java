package designPatterns.creational.builder;

public class User {


    private int id;
    private String name;
    private String address;
    private String phone;

    private User(Builder builder) {
        this.id=builder.id;
        this.name=builder.name;
        this.address=builder.address;
        this.phone=builder.phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder{
        private int id;
        private String name;
        private String address;
        private String phone;


        public Builder setId(int id){
            this.id=id;
            return this;
        }

        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public Builder setAddress(String address){
            this.address=address;
            return this;
        }

        public Builder setPhone(String phone){
            this.phone=phone;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

}

