package day2;

import java.util.Scanner;

public class javaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PRINT BRIDGELABZ
        // System.out.println("Welcome to Bridgelabz!" );

        //SUM 

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);


        // Celsius to Fahrenheit Conversion
        // System.out.println("Enter the temp in clecius");
        // int temp = sc.nextLine();
        // float formula = (temp * )

        


        //
        // int a = 2;
        // int b = 4;
        // if (a > b) {
        // System.out.println(a);
        // } else {
        // System.out.println(b);
        // // }

        // ELSE IF STATEMENTS
        // System.out.println("Enter Number to check Even or Odd");
        // int num = sc.nextInt();
        // if(num%2==0){
        // System.out.println("Even");
        // }else if(num==5){
        // System.out.println("Chomu Number");
        // }
        // else{
        // System.out.println("Odd");
        // }

        // INCOME TAX CALCULOTAR
        // System.out.println("Enter your income");
        // int income = sc.nextInt();
        // if (income < 500000) {
        //     System.out.println("Your Income is Tax free");
        // } else if (income > 500000 && income < 1000000) {
        //     int tax = (int) (income * 0.2);
        //     System.out.println("Your income come into 20% tax "+ (tax+income));
        // } else {
        //     int tax = (int) (income * 0.3);

        //     System.out.println("Your income came into 30% tax"+ tax);

        // }

        //TERNIARY OPERATOR 
        int age = sc.nextInt();
        String condition = (age<18)?"Your can't vote":"you can vote";
        System.out.println(condition);
        

    }
}
