package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();

        int b = a - 1;
        int c = a + 1;
        int d = a + b + c;
        int e = d * d;

        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(e);
        in.close();
    }
}
