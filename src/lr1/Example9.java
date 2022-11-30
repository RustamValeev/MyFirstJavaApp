package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String mounth = in.nextLine();

        System.out.println("Сколько дней в этом месяце?");
        int days = in.nextInt();

        System.out.println(mounth + " содержит " + days + " дней");
        in.close();
    }
}