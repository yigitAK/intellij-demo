package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String user = input.nextLine();

	    System.out.println("Hello World and " + user);

        System.out.println("This is a line.");

        System.out.println("I added a new line.");
    }
}
