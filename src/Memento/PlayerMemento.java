package Memento;

import java.util.ArrayList;
import java.util.List;

class PlayerMemento {
    private final String world;
    private final int level;
    private final int health;
    private final List<String> abilities;

    public PlayerMemento(String world, int level, int health, List<String> abilities) {
        this.world = world;
        this.level = level;
        this.health = health;
        this.abilities = new ArrayList<>(abilities);
    }

    public String getWorld() {
        return world;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public List<String> getAbilities() {
        return new ArrayList<>(abilities);
    }
}