package GameEngine;

import java.awt.event.KeyEvent;

import GameStates.LoadingState;
import TransmuteCore.GameEngine.TransmuteCore;
import TransmuteCore.GameEngine.Manager;
import TransmuteCore.Graphics.Context;
import TransmuteCore.Input.Input;
import TransmuteCore.States.StateManager;
import Utilities.Library;

public class Game extends TransmuteCore
{
    private StateManager stateManager;

    public Game(String gameTitle, String gameVersion, int gameWidth, int gameRatio, int gameScale)
    {
        super(gameTitle, gameVersion, gameWidth, gameRatio, gameScale);
    }

    @Override
    public void init()
    {
        setFPSVerbose(true);

        stateManager = new StateManager(this);

        manager.setStateManager(stateManager);

        stateManager.push(new LoadingState(stateManager));
    }

    @Override
    public void update(Manager manager, double delta)
    {
        if (Input.isKeyPressed(KeyEvent.VK_ESCAPE)) System.exit(0);

        stateManager.update(manager, delta);
    }

    @Override
    public void render(Manager manager, Context ctx)
    {
        stateManager.render(manager, ctx);
    }

    public static void main(String[] args)
    {
        new Game(Library.GAME_TITLE, Library.GAME_VERSION, 640, TransmuteCore.Square, 1);
    }
}
