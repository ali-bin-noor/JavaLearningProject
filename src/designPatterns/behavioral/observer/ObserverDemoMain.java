package designPatterns.behavioral.observer;

import java.util.Scanner;

public class ObserverDemoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Weather Station =====");
            System.out.println("1. Update Temperature");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter temperature : ");
                    notifyDevices(sc.nextInt());
                    break;
                case 0:
                    System.out.println("Application Closed.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void notifyDevices(int temperature) {
        Observer laptop = new LaptopDisplay();
        Observer tv = new TVDisplay();
        Observer mobile = new MobileDisplay();

        Subject weatherStation = new WeatherStation();
        weatherStation.registerObserver(laptop);
        weatherStation.registerObserver(tv);
        weatherStation.registerObserver(mobile);

        weatherStation.notifyObserver(temperature);
    }
}
