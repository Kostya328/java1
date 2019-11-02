package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        return Integer.valueOf(String.valueOf(new StringBuffer(String.valueOf(number)).reverse()));
    }
}
