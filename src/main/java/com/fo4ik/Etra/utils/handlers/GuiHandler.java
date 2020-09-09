package com.fo4ik.Etra.utils.handlers;

import com.fo4ik.Etra.Reference;
import com.fo4ik.Etra.blocks.machines.etratium.ContainerEtratiumFurnace;
import com.fo4ik.Etra.blocks.machines.etratium.GuiEtratiumFurnace;
import com.fo4ik.Etra.blocks.machines.etratium.TileEntityEtratiumFurance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {


    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if (ID == Reference.GUI_ETRATIUM_RURNACE) return new ContainerEtratiumFurnace(player.inventory,(TileEntityEtratiumFurance)world.getTileEntity(new BlockPos(x,y,z)));

        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == Reference.GUI_ETRATIUM_RURNACE) return new GuiEtratiumFurnace(player.inventory,(TileEntityEtratiumFurance)world.getTileEntity(new BlockPos(x,y,z)));
        return null;
    }
}
