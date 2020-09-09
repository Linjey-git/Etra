package com.fo4ik.Etra.items.tools;

import com.fo4ik.Etra.Main;
import com.fo4ik.Etra.init.InitItems;
import com.fo4ik.Etra.utils.interfaces.HasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ToolEtrariumSword extends ItemSword implements HasModel {
    public ToolEtrariumSword(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
//        setDamage(, Integer.MAX_VALUE);
        setCreativeTab(Main.ETRA_TAB);
        setUnlocalizedName(name);

        InitItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(this, 0, "inventory");
    }
}
