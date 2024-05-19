package GameStates;

import GameEngine.Game;
import TransmuteCore.GameEngine.Manager;
import TransmuteCore.Graphics.Context;
import TransmuteCore.States.State;
import TransmuteCore.States.StateManager;

public class GameState extends State
{

    public GameState(StateManager sManager)
    {
        super("gameState", sManager);
        init();
    }

    @Override
    public void init()
    {
        @SuppressWarnings("unused")
       Manager manager = Game.getManager();
    }

    @Override
    public void update(Manager manager, double delta)
    {

    }

    @Override
    public void render(Manager manager, Context ctx)
    {

    }
}
