package Memento;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Mundo 1", 1, 100);
        CheckpointManager checkpointManager = new CheckpointManager();

        player.showStatus();

        player.levelUp();
        player.unlockAbility("Chute Flamejante");
        player.takeDamage(20);
        checkpointManager.saveCheckpoint(player.saveState());

        player.showStatus();

        player.changeWorld("Mundo 2");
        player.unlockAbility("Escudo de Gelo");
        player.takeDamage(80);
        player.showStatus();

        System.out.println("\n⚠️ Restaurando último checkpoint...");
        player.restoreState(checkpointManager.getCheckpoint(0));

        player.showStatus();
    }
}