package com.fo4ik.Etra.blocks.machines.etratium.slot;

import com.fo4ik.Etra.blocks.machines.etratium.TileEntityEtratiumFurance;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotEtratiumFurnaceFuel extends Slot {
    public SlotEtratiumFurnaceFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return TileEntityEtratiumFurance.isItemFuel(stack);
    }

    @Override
    public int getItemStackLimit(ItemStack stack) {
        return super.getItemStackLimit(stack);
    }
}
