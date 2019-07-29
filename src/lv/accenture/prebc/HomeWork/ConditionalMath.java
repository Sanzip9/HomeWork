package lv.accenture.prebc.HomeWork;

import java.util.Scanner;

public class ConditionalMath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number ");
        int a = sc.nextInt();

        System.out.print("Enter a whole number ");
        int b = sc.nextInt();

        sc.close();


        if (a > b) {
            System.out.print(a + " is greater than " + b);

        } else if (b > a) {
            System.out.print(b + " is greater than " + a);

        } else {
            System.out.print(a + " is equal to " + b);
        }


    }
}
// “<A> is greater than <B>”
// “<A> and <B> are equal”
