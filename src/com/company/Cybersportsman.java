package com.company;

public class Cybersportsman extends Character{


    public Cybersportsman() {
        super(new MouseBehavior());
    }

    @Override
    void display() {
        System.out.println("I am killing bots with my aim, decoy, ak-47!");
    }
}
