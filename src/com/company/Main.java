package com.company;

import java.util.Scanner;

public class Main {

    static void Assignment2_1() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day: ");
        int day = input.nextInt();



        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day");
                break;
            case 6:
            case 7:
                System.out.println("It is a holiday");
                break;
            default:
                System.out.println("Not a correct day of week!");



        }





    }

    static void Assignment2_2() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        char grade = input1.next().charAt(0);


        switch (grade) {

            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever! ");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Invalid grade");

        }
    }

    static void Assignment2_3() {
        Scanner math = new Scanner(System.in);
        System.out.println("Please enter the first and the second number: ");
        int first = math.nextInt();
        int second = math.nextInt();
        System.out.println("PLease enter one of options: a= sum; b= subtraction; c= dividing; " +
                "d= multiplication; e= calculate remainder; f= print elements; " +
                "g= which is bigger; h= which is smaller");
        char toDo = math.next().charAt(0);

        switch (toDo) {
            case 'a':
                System.out.println("Sum is " + (first + second));
                break;
            case 'b':
                System.out.println("Result of subtraction is " + (first - second));
                break;
            case 'c':
                System.out.println("Result of dividing is " + (first / second));
                break;
            case 'd':
                System.out.println("Result of multiplication is " + (first * second));
                break;
            case 'e':
                System.out.println("Reminder is " + (first % second));
                break;
            case 'f':
                System.out.println("Numbers you inserted are " + first + " and " + second);
                break;
            case 'g':
                System.out.println("Bigger number is " + (Math.max(first, second)));
                break;
            case 'h':
                System.out.println("Smallest number is " + (Math.min(first, second)));
                break;
            default:
                System.out.println("Bye bye!");

        }



            }









    public static void main(String[] args) {
        //Assignment2_1();
        //Assignment2_2();
        Assignment2_3();

    }
}
