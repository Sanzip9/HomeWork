package lv.accenture.prebc.HomeWork;

import java.util.Scanner;

public class GreetingsInteractive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = sc.nextLine();

        System.out.print("How old are you?");
        int age = sc.nextInt();

        sc.close();

        System.out.println("Hello, my name is " + name + " I am " + age + " years old");



    }

}
