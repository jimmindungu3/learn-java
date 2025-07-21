package com.james;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your role: ");
        String role = scanner.nextLine();

        switch (role){
        case "Admin":
            System.out.println("You have admin rights");
            break;
        case "User":
            System.out.println("You have user rights");
            break;
        default:
            System.out.println("You're a guest");
        }
    }
}
