package com.fo4ik.Etra.items.armor;

import com.fo4ik.Etra.Main;
import com.fo4ik.Etra.init.InitItems;
import com.fo4ik.Etra.utils.interfaces.HasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorBase extends ItemArmor implements HasModel {

    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Main.ETRA_TAB);
        InitItems.ITEMS.add(this);
        setMaxDamage((int) Double.NEGATIVE_INFINITY);
//        player.capabilities.allowFlying = false;
    }



//
//    @Override
//    public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
//        player.capabilities.allowFlying = false;
//
//        if (!(player.getEquipmentAndArmor().equals(null))) {
//            player.capabilities.allowFlying = true;
//            player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 40));
//            player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 40));
//            player.addPotionEffect(new PotionEffect(Potion.getPotionById(16), 100, 0));
//            player.addPotionEffect(new PotionEffect(Potion.getPotionById(10), 2, 1));
//        }
//    }


    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(this, 0, "inventory");
    }
}
