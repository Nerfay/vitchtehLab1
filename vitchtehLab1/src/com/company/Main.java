package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        translationOfNumberSystems();
    }

    private static void translationOfNumberSystems() {
        long number2=0;
        System.out.println("Введите число 10-ой системы счисления:");
        Scanner scan = new Scanner(System.in);
        long number10 = scan.nextLong();
        String temp ="";
        System.out.println("Число переведенно в 2-ю систему счисления:");
        while (number10 != 0) {
            number2 = number10 % 2;
            number10 = number10 / 2;
            temp = number2+temp;
        }
        System.out.print(temp);
    }
}