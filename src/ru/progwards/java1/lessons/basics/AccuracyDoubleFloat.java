package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double a = 4d/3d;
        double p = 3.14d;
        return a*p*radius*radius*radius;
    }
    public static float volumeBallFloat(float radius){
        return 4f/3f*3.14f*radius*radius*radius;
    }
    public static double calculateAccuracy(double radius){
        return volumeBallDouble(radius) - volumeBallFloat((float)radius);
    }
}
