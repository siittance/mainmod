package net.ivanova.mptmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab MPT_TAB = new CreativeModeTab("Mpt tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModeItems.AMBER.get());
        }
    };
}
