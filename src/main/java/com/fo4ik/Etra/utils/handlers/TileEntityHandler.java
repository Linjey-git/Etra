package com.fo4ik.Etra.utils.handlers;

import com.fo4ik.Etra.blocks.machines.etratium.TileEntityEtratiumFurance;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityEtratiumFurance.class,"etratium");
    }
}
