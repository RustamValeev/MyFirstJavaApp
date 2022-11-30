package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш возраст: ");
        int age = in.nextInt();

        int year = 2022 - age;

        System.out.println("Вы родились в " + year + " году");
        in.close();
    }
}
