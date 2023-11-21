package com.example.problemsolving;




import java.util.Scanner;


public class Watermelone {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num =scanner.nextInt();

        if(num <= 2){
            System.out.println("no");
            return;
        }
        if(num % 2 == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }

}
