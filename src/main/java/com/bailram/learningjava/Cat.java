package com.bailram.learningjava;

public class Cat implements Creature{
    @Override
    public void speak() {
        System.out.println("Miaaww");
    }

    @Override
    public void walk() {
        System.out.println("Walk with catwalk style");
    }

    @Override
    public void eat() {
        System.out.println("Eat meat, fish, and little bit grass for cleaning fur in the stomach");
    }

    @Override
    public void sleep() {
        System.out.println("Banyak tidur di siang hari dan sedikit di malam hari");
    }
}
