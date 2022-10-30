package com.startjava.lesson_2_3.animal

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("female");
        wolf.setName("Bagel");
        wolf.setWeight(60);
        wolf.setAge(10);
        wolf.setColor("Pink");
        System.out.println(wolf.getSex());
        System.out.println(wolf.getName());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}