package Utilities;

import TransmuteCore.System.Asset.AssetManager;
import TransmuteCore.System.Asset.Type.Fonts.Font;

public class ResourceLoader
{
    public static void load()
    {
        Font.initializeDefaultFont("fonts/font.png");
        AssetManager.load();
    }
}
