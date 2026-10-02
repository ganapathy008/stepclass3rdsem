package stepclass3rdsem.weekseven;
class Character {
    private int health;
    private final int maxHealth;

    Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    void takeDamage(int amount) {
        health -= amount;
        if (health < 0) health = 0;
        System.out.println("Health after damage: " + health);
    }

    void heal(int amount) {
        health += amount;
        if (health > maxHealth) health = maxHealth;
        System.out.println("Health after healing: " + health);
    }

    int getHealth() {
        return health;
    }
}

public class HealthBar {
    public static void main(String[] args) {
        Character c = new Character(100);
        c.takeDamage(30);
        c.heal(50);
        c.takeDamage(150);
    }
}


