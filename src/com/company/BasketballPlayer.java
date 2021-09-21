package com.company;

public class BasketballPlayer extends Character{

    public BasketballPlayer(WeaponBehavior weaponBehavior) {
        super(new BallBehavior());
    }

    @Override
    void display() {
        System.out.println("I throw the ball to the basketball hoop");
    }
}
