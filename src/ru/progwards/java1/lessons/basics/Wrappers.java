package ru.progwards.java1.lessons.basics;

public class Wrappers {
    public static int sumStringNumbers(String numStr1, String numStr2){
        return Integer.valueOf(numStr1) + Integer.valueOf(numStr2);
    }

    public static String sumInDecString(String numStr1, String numStr2){
       return String.valueOf(sumStringNumbers(numStr1, numStr2));
    }

    public static String sumInBinString(String numStr1, String numStr2){
        return Integer.toBinaryString(sumStringNumbers(numStr1, numStr2));
    }

    public static String sumInOctalString(String numStr1, String numStr2){
        return Integer.toOctalString(sumStringNumbers(numStr1, numStr2));
    }

    public static String sumInHexString(String numStr1, String numStr2){
        return Integer.toHexString(sumStringNumbers(numStr1, numStr2));
    }

    public static String sumInRadixString(String numStr1, String numStr2, int radix){
        return String.valueOf(Integer.parseInt(String.valueOf(sumStringNumbers(numStr1, numStr2)), radix));
    }
}
