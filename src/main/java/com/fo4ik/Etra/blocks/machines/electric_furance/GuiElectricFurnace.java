package com.fo4ik.Etra.blocks.machines.electric_furance;

import com.fo4ik.Etra.Main;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiElectricFurnace extends GuiContainer {
    public static final int WIDTH = 180;
    public static final int HEIGHT = 152;

    private static final ResourceLocation background = new ResourceLocation(Main.MODID, "textures/gui/electric_furnace_gui.png");

    public GuiElectricFurnace(TileElectricFurnace tileEntity, ContainerElectricFurnace container) {
        super(container);

        xSize = WIDTH;
        ySize = HEIGHT;
    }

    public GuiElectricFurnace(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(background);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
