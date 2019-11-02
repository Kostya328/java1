package ru.progwards.java1.lessons.bitsworld;

public class EgtsDirectionAndSpeed {
    public static int getSpeed(short speedAndDir){
        int result;
        int i = 0b00000000_00000000_01111111_11111111;
        result = speedAndDir & i;
        return  result;
    }
    public static int getDirection(byte dirLow, short speedAndDir){
        return dirLow;
        //int result;
        //int i = 0b11111111111111111111111111111111;
        //int a = 0b00000000_00000000_00000000_00000001;
        //i = i & speedAndDir;
        //System.out.println(Integer.toBinaryString(i));
        //result = i >> 15;
        //result = result & a;
        //result = result << 8;
        //int dirLowInt = dirLow;
        //result = dirLowInt | result;
        //return  result;
    }
}
