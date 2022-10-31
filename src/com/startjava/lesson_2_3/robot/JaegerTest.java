package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("CoyoteTango");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Japan");
        jaeger1.setHeight(85.34);
        jaeger1.setWeight(2.312);
        System.out.println("Today we have two guests: \nIn the left corner in red trousers it's" + 
                jaeger1.getModelName() + "\nThe main mark is " + jaeger1.getMark() + " from " + 
                jaeger1.getOrigin() + "\nIt's height is " + jaeger1.getHeight() + " m." + 
                "It's weight is " + jaeger1.getWeight() + " tons.");
        
        Jaeger jaeger2 = new Jaeger("ChernoAlpha", "Mark-1", "Russia", 85.34, 2.412);
        System.out.println("\nIn the right corner in blue trousers it's" + 
                jaeger2.getModelName() + "\nThe main mark is " + jaeger2.getMark() + " from " + 
                jaeger2.getOrigin() + "\nIt's height is " + jaeger2.getHeight() + " m." + 
                "It's weight is " + jaeger2.getWeight() + " tons.");
        System.out.println("Let's fight!");
        jaeger1.printEnergyCore();
        jaeger2.printEnergyCore();
        jaeger1.useMainFightingTechnique();
        jaeger2.useMainFightingTechnique();
        letFight(jaeger1, jaeger2);
    }

    private static void letFight(Jaeger jaeger1, Jaeger jaeger2) {
        if (jaeger1.getStrength() > jaeger2.getStrength()) {
            System.out.println(jaeger1.getModelName() + " wins!");
        } else if (jaeger1.getStrength() < jaeger2.getStrength()) {
            System.out.println(jaeger2.getModelName() + " wins!");
        } else {
            System.out.println("You are both have equal strength. Don't waste your time");
        }
    }
}