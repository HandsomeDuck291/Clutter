package net.handsomeduck.clutter.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.handsomeduck.clutter.Clutter;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CLUT = FabricItemGroupBuilder.build(new Identifier(Clutter.MOD_ID, "clut"),() -> new ItemStack(ModItems.RUBY));
}
