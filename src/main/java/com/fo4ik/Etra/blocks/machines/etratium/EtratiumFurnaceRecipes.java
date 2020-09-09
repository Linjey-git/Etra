package com.fo4ik.Etra.blocks.machines.etratium;

import com.fo4ik.Etra.init.InitBlocks;
import com.fo4ik.Etra.init.InitItems;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.Map;
import java.util.Map.Entry;

public class EtratiumFurnaceRecipes {
    private static final EtratiumFurnaceRecipes INSTANCE = new EtratiumFurnaceRecipes();
    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static EtratiumFurnaceRecipes getInstance() {
        return INSTANCE;
    }

    private EtratiumFurnaceRecipes() {
        addEtratiumRecipe(new ItemStack(Items.DIAMOND), new ItemStack(InitBlocks.ETRATIUM_ORE), new ItemStack(InitItems.ETRATIUM_INGOT),50.0F);
    }


    public void addEtratiumRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) {
        if (getEtratiumResult(input1, input2) != ItemStack.EMPTY) return;
        this.smeltingList.put(input1, input2, result);
        this.experienceList.put(result, Float.valueOf(experience));
    }

    public ItemStack getEtratiumResult(ItemStack input1, ItemStack input2) {
        for (Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) {
            if (this.compareItemStacks(input1, (ItemStack) entry.getKey())) {
                for (Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) {
                    if (this.compareItemStacks(input2, (ItemStack) ent.getKey())) {
                        return (ItemStack) ent.getValue();
                    }
                }
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() {
        return this.smeltingList;
    }

    public float getEtratiumExperience(ItemStack stack) {
        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) {
            if (this.compareItemStacks(stack, (ItemStack) entry.getKey())) {
                return ((Float) entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}
