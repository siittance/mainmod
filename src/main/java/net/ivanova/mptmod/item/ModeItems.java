package net.ivanova.mptmod.item;

import net.ivanova.mptmod.MptMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModeItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));
    public static final RegistryObject<Item> AMBERRAW = ITEMS.register("amberraw",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public  static  void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
