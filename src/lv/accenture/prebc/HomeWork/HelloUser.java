package lv.accenture.prebc.HomeWork;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String input = sc.nextLine();
        sc.close();


        String fullName = ((input).trim());
        int spaceIndex = fullName.indexOf(" ");


        String name = fullName.substring(0, spaceIndex);
        String cutsurname = fullName.substring(spaceIndex);
        String surname = cutsurname.trim();

        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase()+ " " + surname.toUpperCase());


    }
}
// John LEMON
