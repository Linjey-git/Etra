package com.fo4ik.Etra;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

public class CraftingRegister {
    public static void register()
    {
        registerRecipes("etratium_chestplate");
        registerRecipes("etratium_boot");
        registerRecipes("etratium_leggs");
        registerRecipes("etratium_helmet");
        registerRecipes("etratium_block_to_ingot");
        registerRecipes("etratium_multitool");
    }

    private static void registerRecipes(String name)
    {
        CraftingHelper.register(new ResourceLocation("etra", name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
    }
}
