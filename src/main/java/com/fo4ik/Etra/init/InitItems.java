package com.fo4ik.Etra.init;

import com.fo4ik.Etra.Reference;
import com.fo4ik.Etra.items.armor.ArmorBase;
import com.fo4ik.Etra.items.ItemEtrariumIngot;
import com.fo4ik.Etra.items.tools.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class InitItems {
    //There initialize items and blocks for mod

    public static final List<Item> ITEMS = new ArrayList<>();

    //Materials
    public static final Item.ToolMaterial MATERIAL_ETRATIUM = EnumHelper.addToolMaterial("material_etramium", 4, -1, 30.0F, 50.0F, 8);
    //public static final Item.ToolMaterial MATERIAL_ETRATIUM_SUPER = EnumHelper.addToolMaterial("material_etramium_super", 6, -1, 30.0F, 70.0F, 10);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_ETRATIUM = EnumHelper.addArmorMaterial("armor_material_etarium", Reference.MODID + ":etratium", Integer.MAX_VALUE,
            new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Integer.MAX_VALUE);



    //Items
    public static final Item ETRATIUM_INGOT = new ItemEtrariumIngot("etratium_ingot");

    //Tools
//    public static final ItemMultyTool ETRAITEM_MULTY_TOOL = new
    public static final ItemSword ETRATIUM_SWORD = new ToolEtrariumSword("etratium_sword", MATERIAL_ETRATIUM);
    public static final ItemPickaxe ETRATIUM_PICKAXE = new ToolEtrariumPickaxe("etratium_pickaxe", MATERIAL_ETRATIUM);
    public static final ItemAxe ETRATIUM_AXE = new ToolEtrariumAxe("etratium_axe", MATERIAL_ETRATIUM);
    public static final ItemSpade ETRATIUM_SHOVEL = new ToolEtrariumShovel("etratium_shovel", MATERIAL_ETRATIUM);
    public static final ItemHoe ETRATIUM_HOE = new ToolEtrariumHoe("etratium_hoe", MATERIAL_ETRATIUM);
    public static final Item ETRATIUM_MULTiTOOL = new ToolEtratiumMultitool("etratium_multitool", MATERIAL_ETRATIUM);



    //Armor
    public static final ArmorBase ETRATIUM_HELMET = new ArmorBase("etratium_helmet", ARMOR_MATERIAL_ETRATIUM, 1, EntityEquipmentSlot.HEAD);
    public static final Item ETRATIUM_CHESTPLATE = new ArmorBase("etratium_chestplate", ARMOR_MATERIAL_ETRATIUM, 1, EntityEquipmentSlot.CHEST);
    public static final Item ETRATIUM_LEGGS = new ArmorBase("etratium_leggs", ARMOR_MATERIAL_ETRATIUM, 2, EntityEquipmentSlot.LEGS);
    public static final Item ETRATIUM_BOOTS = new ArmorBase("etratium_boots", ARMOR_MATERIAL_ETRATIUM, 1, EntityEquipmentSlot.FEET);
}
