package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String user = input.nextLine();

	    System.out.println("Hello World and " + user);
    }
}
