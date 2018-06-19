package Speed;

import java.util.Scanner;

public class SpeedTest {
    public static void main(String[] args) {
        Speed [] speeds = Speed.values();
        System.out.println("Dostepne predkosci: ");
        for (Speed speed: speeds) {
            System.out.println(speed);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz predkosc: ");
        String userSpeed = scanner.nextLine();

        Speed usSpeed = Speed.valueOf(userSpeed);

        System.out.println("Poruszasz sie z predkoscia " + userSpeed + ", ktora wynosi " + usSpeed.getSpeedName());
    }
}
