package com.fo4ik.Etra;


import com.fo4ik.Etra.blocks.machines.electric_furance.TileElectricFurnace;
import com.fo4ik.Etra.proxy.CommonProxy;
import com.fo4ik.Etra.utils.handlers.GuiHandler;
import com.fo4ik.Etra.world.ModWorldGen;
import com.fo4ik.Etra.world.gen.WorldGenCustomStructures;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTRD_MINECRAFT_VERSION
)


public class Main {

    public static final String MODID = "etra";
    public static final String NAME = "Etra";
    public static final String VERSION = "1.0.0";



    public static final CreativeTabs ETRA_TAB = new EtraTab("etra_tab"); //Creative Tabs
    @Mod.Instance
    public static Main instance;
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    //InitializationEvent
    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
        GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(),0);
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance,new GuiHandler());
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Item> event){
        GameRegistry.registerTileEntity(TileElectricFurnace.class, Main.MODID + "_electric_furnace");
    }
}
