package com.company.PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {


    /**
     * Java Program to check if a number is Prime or Not. This program accepts a
     * number from command prompt and check if it is prime or not.
     *
     * @author  http://java67.blogspot.com
     */

        public static void main(String args[]) {
            Scanner scnr = new Scanner(System.in);
            int number = Integer.MAX_VALUE;
            System.out.println("Enter number to check if prime or not ");
            while (number != 0) {
                number = scnr.nextInt();
                System.out.printf("Does %d is prime? %s %s  %s %n", number,
                        isPrime(number), isPrimeOrNot(number), isPrimeNumber(number));
            }
        }


        /*
         * Java method to check if an integer number is prime or not.
         * @return true if number is prime, else false
         */
        public static boolean isPrime(int number) {
            int sqrt = (int) Math.sqrt(number) + 1;
            for (int i = 2; i < sqrt; i++) {
                if (number % i == 0) {
                    // number is perfectly divisible - no prime
                    return false;
                }
            }
            return true;
        }


        /*
         * Second version of isPrimeNumber method, with improvement like not
         * checking for division by even number, if its not divisible by 2.
         */
        public static boolean isPrimeNumber(int number) {
            if (number == 2 || number == 3) {
                return true;
            }
            if (number % 2 == 0) {
                return false;
            }
            int sqrt = (int) Math.sqrt(number) + 1;
            for (int i = 3; i < sqrt; i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }


        /*
         * Third way to check if a number is prime or not.
         */
        public static String isPrimeOrNot(int num) {
            if (num < 0) {
                return "not valid";
            }
            if (num == 0 || num == 1) {
                return "not prime";
            }
            if (num == 2 || num == 3) {
                return "prime number";
            }
            if ((num * num - 1) % 24 == 0) {
                return "prime";
            } else {
                return "not prime";
            }
        }
    }

/*
    Output
    Enter number to check if prime or not
2? Does 2 is prime? true prime number  true
            3? Does 3 is prime? true prime number  true
            4? Does 4 is prime? false not prime  false
            5? Does 5 is prime? true prime  true
            6? Does 6 is prime? false not prime  false
            7? Does 7 is prime? true prime  true
            17? Does 17 is prime? true prime  true
            21? Does 21 is prime? false not prime  false
            131? Does 131 is prime? true prime  true
            139? Does 139 is prime? true prime  true
*/


