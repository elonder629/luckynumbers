package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        perfectRandom luckynumbers[] = new perfectRandom[5];
        int i = 0;
        do {
            System.out.println("Please enter your Name!");
            String name = input.nextLine();
            luckynumbers[i] = new perfectRandom(name);
            System.out.println("Nice to meet you " + luckynumbers[i].Name + "! Your lucky number is " + luckynumbers[i].luckyNumber);
            i++;
            System.out.println("Please enter '0' to exit, '1' for a listing of all names and lucky numbers, or '2' to enter another name");
            String control = input.nextLine();
            if (control.equalsIgnoreCase("0")) {
                exit = true;
            } else if (control.equalsIgnoreCase("1")) {
                for (int x = 0; x < luckynumbers.length; x++) {
                    System.out.println("Nice to meet you" + luckynumbers[x].Name + "! Your lucky number is" + luckynumbers[x].luckyNumber);
                }
            }
        } while (!exit);
    }
}
