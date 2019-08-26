package ru.progwards.java1.lessons.bitsworld;

public class Task2 {
    public static int checkBit(byte value, int bitNumber){
        int res;
        String s = Integer.toBinaryString(value);
        System.out.println("Представление " + s);
        if(s.length() < bitNumber)
            return 0;
        //s = s.substring(8 - bitNumber, 9 - bitNumber);
        char c = s.charAt(s.length() - bitNumber);
        res = c - '0';
        return res;
    }
}
