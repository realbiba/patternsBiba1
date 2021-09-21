package com.company;

public class Swimmer extends Character {

    public Swimmer(WeaponBehavior weaponBehavior) {
         super(new SwimBehavior());
    }

    @Override
    void display() {
        System.out.println("I am swimming till the finish line!");
    }
}
