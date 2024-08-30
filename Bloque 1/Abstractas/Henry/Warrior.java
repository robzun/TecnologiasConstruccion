package Abstractas;

import java.util.*;

public class Warrior extends Character{
    private String weapon;

    public Warrior(String name, int health, int level, String weapon){
        super(name, health, level);
        this.weapon = weapon;
    }
    public void upgradeWeapon(){
        System.out.println("El guerrero " + getName() + " ha mejorado su " + this.weapon);
        int level = getLevel();
        setLevel(++level);
    }

    @Override
    public void attack(Character enemy){
        System.out.println("El guerrero " + getName() + " ataca a " + enemy.getName());
        int damage = (int)(Math.random()*20);
        enemy.setHealth(enemy.getHealth() - damage);
    }

    @Override
    public void heal(){
        int healing = (int)(Math.random()*15);
        setHealth(getHealth() + healing);
        System.out.println(getName() + " se ha curado " + healing + " puntos de vida.");
    }

    @Override
    public void ulti(Character enemy){
        System.out.println("El guerrero " + getName() + " ataca a " + enemy.getName() + "con su ulti");
        int damage = (int)(Math.random()*45);
        enemy.setHealth(enemy.getHealth() - damage);
    }
}