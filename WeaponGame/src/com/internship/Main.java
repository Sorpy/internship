package com.internship;

import com.internship.weapons.Knife;
import com.internship.weapons.Pistol;
import com.internship.weapons.PlasmaGun;
import com.internship.weapons.Weapon;

public class Main {

    public static void main(String[] args) {
        Weapon knife = new Knife();
        Weapon pistol = new Pistol();
        Weapon plasma = new PlasmaGun();
        Player player = new Player("Ivan",pistol);
    }
}
