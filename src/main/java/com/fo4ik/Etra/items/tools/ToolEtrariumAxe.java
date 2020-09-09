package com.fo4ik.Etra.items.tools;

import com.fo4ik.Etra.Main;
import com.fo4ik.Etra.init.InitItems;
import com.fo4ik.Etra.utils.interfaces.HasModel;
import net.minecraft.item.ItemAxe;

public class ToolEtrariumAxe extends ItemAxe implements HasModel {
    public ToolEtrariumAxe(String name, ToolMaterial material) {
        super(material, Integer.MAX_VALUE, -2.2F);
        setCreativeTab(Main.ETRA_TAB);
        setRegistryName(name);
        setUnlocalizedName(name);
        InitItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(this, 0, "inventory");
    }
}
