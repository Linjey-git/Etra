package com.fo4ik.Etra.blocks;

import com.fo4ik.Etra.Main;
import com.fo4ik.Etra.init.InitBlocks;
import com.fo4ik.Etra.init.InitItems;
import com.fo4ik.Etra.utils.interfaces.HasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Random;

public class EtratiumOre extends Block implements HasModel {
    public EtratiumOre(String name, Material material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(Main.ETRA_TAB);
        setSoundType(SoundType.STONE);

        InitBlocks.BLOCKS.add(this);
        InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
        Random random1 = new Random();
        int chanse = random1.nextInt(3);
        System.out.println("chanse " + chanse);
        if (chanse == 2) {
            return InitItems.ETRATIUM_INGOT;
        } else {
            //Minecraft.getMinecraft().player.sendChatMessage("Sorry in the next time");
            return null;
        }
    }

//    @Override
//    public int quantityDropped(Random random){
//        int max = 3;
//        int min = 1;
//        return random.nextInt(max)+min;
//    }



    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }
}
