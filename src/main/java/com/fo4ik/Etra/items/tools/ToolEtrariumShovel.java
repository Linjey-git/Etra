package com.fo4ik.Etra.items.tools;

import com.fo4ik.Etra.Main;
import com.fo4ik.Etra.init.InitItems;
import com.fo4ik.Etra.utils.interfaces.HasModel;
import net.minecraft.item.ItemSpade;

public class ToolEtrariumShovel extends ItemSpade implements HasModel {
    public ToolEtrariumShovel(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setCreativeTab(Main.ETRA_TAB);
        setUnlocalizedName(name);


        InitItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(this, 0, "inventory");
    }
}
