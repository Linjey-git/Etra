package com.fo4ik.Etra.blocks.other;

import com.fo4ik.Etra.Main;
import com.fo4ik.Etra.init.InitBlocks;
import com.fo4ik.Etra.init.InitItems;
import com.fo4ik.Etra.utils.interfaces.HasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class EtratiumBlock extends Block implements HasModel {
    public EtratiumBlock(String name, Material material) {
        super(material);

        setRegistryName(name);
        setUnlocalizedName(name);
        setHardness(4);
        setResistance(4);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(Main.ETRA_TAB);
        setSoundType(SoundType.METAL);

        InitBlocks.BLOCKS.add(this);
        InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }



    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }


}
