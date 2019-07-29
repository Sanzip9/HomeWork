package lv.accenture.prebc.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args){

        Random r = new Random();
        int rnd = r.nextInt((10)+1);

        System.out.print("Enter number between 1-10: ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        sc.close();

        if (x == rnd) {
            System.out.println("!!!YOU WIN!!!");
        } else if (x > rnd){
            System.out.println("guess a smaller number");
        } else {
            System.out.println("guess a greater number");
        }


        System.out.println(rnd);

    }
}
