package GameStates;

import GameEngine.Game;
import TransmuteCore.GameEngine.Manager;
import TransmuteCore.Graphics.Context;
import TransmuteCore.States.State;
import TransmuteCore.States.StateManager;
import TransmuteCore.System.Asset.AssetManager;
import Utilities.ResourceLoader;

public class LoadingState extends State
{

    public LoadingState(StateManager stateManager)
    {
        super("loadingState", stateManager);
        init();
    }

    @Override
    public void init()
    {
        Manager manager = Game.getManager();

        ResourceLoader.load();

        manager.setAssetManager(AssetManager.getInstance());
    }

    @Override
    public void update(Manager manager, double delta)
    {
        if (AssetManager.isLoaded()) stateManager.push(new GameState(stateManager));
    }

    @Override
    public void render(Manager manager, Context ctx)
    {
    }
}
