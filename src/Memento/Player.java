package Memento;

import java.util.ArrayList;
import java.util.List;

class Player {
    private String world;
    private int level;
    private int health;
    private List<String> abilities;

    public Player(String world, int level, int health) {
        this.world = world;
        this.level = level;
        this.health = health;
        this.abilities = new ArrayList<>();
    }

    public void unlockAbility(String ability) {
        abilities.add(ability);
    }

    public void takeDamage(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    public void levelUp() {
        this.level++;
    }

    public void changeWorld(String newWorld) {
        this.world = newWorld;
    }

    public PlayerMemento saveState() {
        return new PlayerMemento(world, level, health, abilities);
    }

    public void restoreState(PlayerMemento memento) {
        this.world = memento.getWorld();
        this.level = memento.getLevel();
        this.health = memento.getHealth();
        this.abilities = memento.getAbilities();
    }

    public void showStatus() {
        System.out.println("Mundo: " + world + ", Nível: " + level + ", Vida: " + health + ", Habilidades: " + abilities);
    }
}