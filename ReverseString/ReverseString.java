package com.company.ReverseString;

public class ReverseString {


    /**
     * Java program to reverse String in Java.
     * There are multiple ways to reverse
     * String in Java, you can either take help of standard
     * Java API StringBuffer to reverse String in Java.
     * StringBuffer has a reverse() method which returns StringBuffer
     * with reversed contents.
     * <p>
     * On the other hand, you can also reverse it by applying your
     * own logic, if asked to reverse String without
     * using StringBuffer in Java.
     * <p>
     * By the way you can also use StringBuilder to reverse
     * String in Java. StringBuilder is non-thread-safe
     * version of StringBuffer and provides similar API.
     * You can use StringBuilder's reverse()
     * method to reverse content and then convert it back to String
     *
     * @author http://java67.blogspot.com
     */


    public static void main(String args[]) {

            //quick wasy to reverse String in Java - Use StringBuffer
            String word = "HelloWorld";
            String reverse = new StringBuffer(word).reverse().toString();
            System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);

                    //another quick to reverse String in Java - use StringBuilder
                    word = "WakeUp";
            reverse = new StringBuilder(word).reverse().toString();
            System.out.printf(" original String : %s , reversed String %s %n", word, reverse);

                    // one way to reverse String without using
                    // StringBuffer or StringBuilder is writing
                    // own utility method
                    word = "Band";
            reverse = reverse(word);
            System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
        }


        private static String reverse(String source){
            if(source == null || source.isEmpty()){
                return source;
            }
            String reverse = "";
            for(int i = source.length() -1; i>=0; i--){
                reverse = reverse + source.charAt(i);
            }

            return reverse;
        }

    }


/*
    Output:
    original String: HelloWorld, reversed String dlroWolleH
    original String: WakeUp, reversed String pUekaW
    original String: Band, reversed String dnaB
    */

