package com.example.problemsolving;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        long num =scanner.nextLong();

        if(num == 1) {
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
    }
}
