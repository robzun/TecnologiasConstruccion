package Abstractas;

public class Main {
    public static void main(String[] args) {
        Wizard merlin = new Wizard("Merlin",100,7,"cetro");
        Warrior mag = new Warrior("Mag", 100, 3, "cabezazo");

        merlin.attack(mag);
    }
}
