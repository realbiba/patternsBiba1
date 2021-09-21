package com.company;

public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public Character(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public void performActing(){
        this.weaponBehavior.acting();
    }

    abstract void display();

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}