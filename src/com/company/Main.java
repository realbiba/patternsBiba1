package com.company;

public class Main {

    public static void main(String[] args) {

        Character character = new Boxer();

        System.out.print("Yo, ");
        character.display();
        character.performActing();

        character.setWeaponBehavior(new SwimBehavior());
        System.out.print("Yo, there is my second talent: \n");
        character.performActing();


    }
}
