package com.fo4ik.Etra.init;


import com.fo4ik.Etra.blocks.machines.electric_furance.ElectricFurance;
import com.fo4ik.Etra.blocks.machines.etratium.EtratiumFurnace;
import com.fo4ik.Etra.blocks.other.EtratiumBlock;
import com.fo4ik.Etra.blocks.other.EtratiumBlockDouble;
import com.fo4ik.Etra.blocks.other.EtratiumOre;
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
    public static final Block ETRATIUM_FURNACE = new EtratiumFurnace("etratium_furnace", Material.IRON);
    public static final Block ELECTRIC_FURNACE = new ElectricFurance("electric_furnace",Material.IRON);
    // public static final Block GROUND_CHEST = new GroundChest("ground_chest");


}
