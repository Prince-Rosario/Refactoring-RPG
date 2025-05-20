package ru.hits;

import static ru.hits.Main.*;

public class CheckStatusAction implements IAction {
    @Override
    public void handleAction(GameState state) {
        System.out.println("HP: " + state.playerHp() + "/" + state.playerMaxHp() + ", Level: " + state.playerLevel() + ", EXP: " + state.playerExp());
        System.out.println("Inventory: " + inventory);

    }
}
