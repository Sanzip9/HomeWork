package lv.accenture.prebc.HomeWork;

import java.util.Scanner;

public class DateValidator {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date: ");
        int date = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        sc.close();




        String monthone = "January";

//      month 1 3 5 7 8 10 12 <= 31
//      month 4 6 9 11 <= 30
//      month 2 = 29

        if ((date >= 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.print(date + monthone + year);

        } else if (( date >= 29) && (month == 2)) {
            System.out.print(date + monthone + year);

        } else {
            System.out.print(date + monthone + year);
        }


        //       if (month)

//      Check if the date is valid for entered month .e.g date = 31 and month = 4 is not a valid combination
//     1 3 5 7 8 10 12 - 31 diena
//     2 - 28,29 dienas
//     4 6 9 11 - 30 dienas



    }
}

// 5. February, 1999