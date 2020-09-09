package com.fo4ik.Etra.items.tools;

import com.fo4ik.Etra.Main;
import com.fo4ik.Etra.init.InitItems;
import com.fo4ik.Etra.utils.interfaces.HasModel;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

import java.util.Set;

public class ToolEtratiumMultitool extends ItemPickaxe implements HasModel {

    private float efficiencyOnProperMaterial;

    public ToolEtratiumMultitool(String name, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.ETRA_TAB);
        InitItems.ITEMS.add(this);

    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("pickaxe", "spade", "sword", "axe");
    }

    private static Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[]{
            Blocks.GRASS, Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL,
            Blocks.SNOW_LAYER, Blocks.SNOW, Blocks.CLAY, Blocks.FARMLAND,
            Blocks.SOUL_SAND, Blocks.MYCELIUM, Blocks.PLANKS, Blocks.BOOKSHELF,
            Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN});

    @Override
    public boolean canHarvestBlock(IBlockState block) {
        return EFFECTIVE_ON.contains(block) ? true : super.canHarvestBlock(block);
    }
    public float getDestroySpeed(ItemStack stack, IBlockState state) {Material material = state.getMaterial();
        if( material == Material.WOOD && material == Material.PLANTS && material == Material.VINE) {
            return this.efficiency;
        }

        return EFFECTIVE_ON.contains(state.getBlock()) ? this.efficiency : super.getDestroySpeed(stack, state);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(this, 0, "inventory");
    }
}
