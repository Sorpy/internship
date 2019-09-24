package com.internship;

import com.internship.weapons.Weapon;

public class Player {
    private Weapon weapon;
    private String name;

    public Player(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
        action();
    }

    private void action(){
        System.out.println(name + " used " + weapon.weaponAction());
    }
}
