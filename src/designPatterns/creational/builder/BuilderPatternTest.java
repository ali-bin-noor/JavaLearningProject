package designPatterns.creational.builder;

public class BuilderPatternTest {
    public static void main(String[] args) {

        User build = new User.Builder().setName("Rahul").setId(101).
                setAddress("Pune").setPhone("23672342").build();
        System.out.println(build);
    }

}
