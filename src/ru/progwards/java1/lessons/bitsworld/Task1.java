package ru.progwards.java1.lessons.bitsworld;

public class Task1 {
    public static void main(String args){
    }
    public static int sumBits(byte value){
        int res = 0;
        String s = Integer.toBinaryString(value);
        s = s.replace("0", "");
        char[] c = s.toCharArray();
        res = c.length;
//        byte b = 0b00000001;
//for(int i = 0; i < 8; i++) {
//    int a = value >> 1;
//    if ((a & b) == 1) {
//        res++;
//    }
//}
        return res;
    }
}
