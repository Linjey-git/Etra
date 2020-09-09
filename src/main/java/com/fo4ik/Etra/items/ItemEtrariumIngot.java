package com.fo4ik.Etra.items;

import com.fo4ik.Etra.Main;
import com.fo4ik.Etra.init.InitItems;
import com.fo4ik.Etra.utils.interfaces.HasModel;
import net.minecraft.item.Item;

public class ItemEtrariumIngot extends Item implements HasModel {
    public ItemEtrariumIngot(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Main.ETRA_TAB);
        InitItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(this, 0, "inventory");
    }


}
