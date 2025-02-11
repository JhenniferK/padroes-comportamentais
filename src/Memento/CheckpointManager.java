package Memento;

import java.util.ArrayList;
import java.util.List;

class CheckpointManager {
    private List<PlayerMemento> checkpoints = new ArrayList<>();

    public void saveCheckpoint(PlayerMemento memento) {
        checkpoints.add(memento);
    }

    public PlayerMemento getCheckpoint(int index) {
        if (index >= 0 && index < checkpoints.size()) {
            return checkpoints.get(index);
        }
        return null;
    }
}