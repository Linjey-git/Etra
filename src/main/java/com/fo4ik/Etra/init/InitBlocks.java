package com.fo4ik.Etra.init;


import com.fo4ik.Etra.blocks.*;
import com.fo4ik.Etra.blocks.machines.etratium.EtratiumFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;


public class InitBlocks {
    //There initialize items and blocks for mod

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Block
    public static final Block ETRATIUM_BLOCK = new EtratiumBlock("etratium_block", Material.IRON);
    public static final Block ETRATIUM_ORE = new EtratiumOre("etratium_ore", Material.ROCK);
    public static final Block ETRATIUM_BLOCK_DOUBLE = new EtratiumBlockDouble("etratium_block_double", Material.ROCK);
    public static final Block ETRATIUM_FURNACE = new EtratiumFurnace("etratium_furance", Material.IRON);
    // public static final Block GROUND_CHEST = new GroundChest("ground_chest");


}
