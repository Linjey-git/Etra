package com.fo4ik.Etra.blocks;

import com.fo4ik.Etra.Main;
import com.fo4ik.Etra.init.InitBlocks;
import com.fo4ik.Etra.init.InitItems;
import com.fo4ik.Etra.utils.interfaces.HasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class EtratiumBlockDouble extends Block implements HasModel {
    public EtratiumBlockDouble(String name, Material rock) {
        super(rock);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Main.ETRA_TAB);
        setHardness(5);
        setResistance(5);
        setHarvestLevel("pickaxe", 4);

        InitBlocks.BLOCKS.add(this);
        InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }
}
