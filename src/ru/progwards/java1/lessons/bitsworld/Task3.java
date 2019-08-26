package ru.progwards.java1.lessons.bitsworld;

public class Task3 {
    public static int getSpeed(short speedAndDir){
        int result;
        int i = 0b00000000_00000000_01111111_11111111;
        result = speedAndDir & i;
        return  result;
    }
    public static int getDirection(byte dirLow, short speedAndDir){
        int result;
        int i = 0b00000000_00000000_00000001_00000000;
        result = speedAndDir >> 6;
        result = result & i;
        int dirLowInt = dirLow;
        result = dirLowInt & result;
        return  result;
    }
}
