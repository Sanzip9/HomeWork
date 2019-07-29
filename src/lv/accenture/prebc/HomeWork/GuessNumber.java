package lv.accenture.prebc.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args){

        Random r = new Random();
        int rnd = r.nextInt((10)+1);
        System.out.println(rnd);
        Scanner sc = new Scanner(System.in);
        int x = 0;


        do {
            System.out.print("Enter number between 1-10: ");
            x = sc.nextInt();

            if (x > rnd) {
                System.out.println("guess a smaller number");

            } else if (x < rnd) {
                System.out.println("guess a greater number");
            }

        } while (x != rnd);
        System.out.println("!!!YOU WIN!!!");


        sc.close();
    }
}
