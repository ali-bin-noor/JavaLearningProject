package designPatterns.creational.singleton;

public class SingletonMain extends  Thread{

    public void run(){
        for (int i=0 ; i< 200 ; i++){
            UserBean userObject = UserBean.createUserObject();
            System.out.println(Thread.currentThread().getName()+" : " +userObject.hashCode());
        }

    }


    public static void main(String[] args) {


        SingletonMain o1 = new SingletonMain();
        SingletonMain o2 = new SingletonMain();
        SingletonMain o3 = new SingletonMain();
        SingletonMain o4 = new SingletonMain();

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        Thread t3 = new Thread(o3);
        Thread t4 = new Thread(o4);

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t4.setName("Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
