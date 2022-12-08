package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Romeo Blue");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("United States of America");
        jaeger1.setHeight(77.72f);
        jaeger1.setWeight(7.775f);
        jaeger1.setStrength(7);
        jaeger1.setArmor(6);
        System.out.println(jaeger1.scanKaiju());
        
        Jaeger jaeger2 = new Jaeger("Tacit Ronin", "Mark-1", "Japan", 74.37f, 7.45f, 7, 3);
        jaeger2.useVortexCannon();
        System.out.println(jaeger1.getModelName() + " " + jaeger1.getArmor());
        System.out.println(jaeger2.drift());
    }
}