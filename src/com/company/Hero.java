package com.company;

public class Hero {
private  int  health ;
private  int  damage ;
private  String   superskills ;


    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperskills() {
        return superskills;
    }

    public Hero(int health, int damage, String superskills) {
        this.health = health;
        this.damage = damage;
        this.superskills = superskills;





    }
}
