package lv.accenture.prebc.HomeWork;

import java.util.Scanner;

public class BasicMath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter whole number ");
        int a = sc.nextInt();

        System.out.print("Enter decimal number ");
        double b = sc.nextDouble();

        double SUM = a + b;
        double SUB = a - b;
        double MUL = a * b;
        double DIV = a / b;

        double z = Math.sqrt (SUM + (SUM * SUM));

        double s = (SUM + (SUM * SUM));
        double SQU = Math.sqrt(s);

        sc.close();

        System.out.println("Sum of " + a + " and " + b + " is " + SUM);

        System.out.println("Substracting " + a + " and " + b + " is " + SUB);

        System.out.println("Multiplying " + a + " and " + b + " the result is " + MUL);

        System.out.println("Dividing " + a + " and " + b + " the result is " + DIV);

        System.out.println(z);
        System.out.println(SQU);


//       Sum of <A> and <B> is <SUM>
//       Subtracting <A> and <B> is <SUB>
//       Multiplying <A> and <B> the result is <SUB>
    }
}
