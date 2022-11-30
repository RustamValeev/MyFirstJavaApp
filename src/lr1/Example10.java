package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год вашего рождения: ");
        int year = in.nextInt();

        int age = 2022 - year;

        System.out.println("Ваш возраст - " + age + " лет");
        in.close();
    }
}
