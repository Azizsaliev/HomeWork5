package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int numbers = 23;
        String str = new String();

        Boss boss = new Boss();
        boss.setBossDamage(77);
        boss.setBossDefenceType(100);
        boss.setBossHealth(999);
        System.out.println("Boss");
        System.out.println("BossDamage = " + boss.getBossDamage());
        System.out.println("BossHealth = " + boss.getBossHealth());
        System.out.println("BossDefenceType = " + boss.getBossDefenceType());


    }

}
