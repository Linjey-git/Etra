package com.fo4ik.Etra;

import com.fo4ik.Etra.init.InitItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EtraTab extends CreativeTabs {

    public EtraTab(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {

        return new ItemStack(InitItems.ETRATIUM_INGOT);
    }
}
