import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // PUT YOUR CODE HERE
        Car car = new Car();

        Scanner scanner = new Scanner(System.in);
        car.year = scanner.nextInt();
        car.model = scanner.next();
        car.speed = scanner.nextInt();

        System.out.print(car.year + " " + car.model + " " + car.speed);
    }

}

class Car {
    int year;
    String model;
    int speed;
//    int year = 2034;
//    String model = "SuperCar";
//    int speed = 1300;

}
