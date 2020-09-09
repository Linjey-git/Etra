package com.fo4ik.Etra.items.tools;

import com.fo4ik.Etra.Main;
import com.fo4ik.Etra.init.InitItems;
import com.fo4ik.Etra.utils.interfaces.HasModel;
import net.minecraft.item.ItemPickaxe;

public class ToolEtrariumPickaxe extends ItemPickaxe implements HasModel {
    public ToolEtrariumPickaxe(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setCreativeTab(Main.ETRA_TAB);
        setUnlocalizedName(name);
        setHarvestLevel("pickaxe", 5);


        InitItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(this, 0, "inventory");
    }
}
