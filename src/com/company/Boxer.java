package com.company;

public class Boxer extends Character {

    public Boxer() {
        super(new GlovesBehavior());
    }

    @Override
    void display() {
        System.out.println("I am hitting my opponent with uppercott!");
    }
}
