package Abstractas;

public abstract class Character {
    private String name;
    private int health;
    private int level;

    public Character(String name, int health, int level){
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public void showStatus(){
        System.out.println(this.name + " tiene " + this.health + " puntos de vida y su nivel es " + this.level);
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getLevel(){
        return level;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setHealth(int newHealth){
        health = newHealth;
    }

    public void setLevel(int newLevel){
        level = newLevel;
    }

    public abstract void attack(Character enemy);

    public abstract void heal();

    public abstract void ulti(Character enemy);
}
