package net.handsomeduck.clutter.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.handsomeduck.clutter.Clutter;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registry.ITEM, new Identifier(Clutter.MOD_ID, name), item);
    }

    public static final ItemGroup clutter = FabricItemGroupBuilder
            .create(new Identifier(Clutter.MOD_ID, "clutter"))
            .icon(() -> new ItemStack(ItemRegistry.RUBY)).build();

    public static final Item FAIRY_SPAWN_EGG = registerItem("fairy_spawn_egg",
            new SpawnEggItem(EntityRegistry.FAIRY, 16761035, 65280, new Item.Settings().group(ItemGroup.MISC)));
    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings().group(clutter)));
    public static final BlockItem COMP = registerItem("comp",
            new BlockItem(BlockRegistry.COMP, new Item.Settings().group(clutter)));
    public static final BlockItem RUBY_ORE = registerItem("ruby_ore",
            new BlockItem(BlockRegistry.RUBY_ORE, new Item.Settings().group(clutter)));

    public static void registerModItems(){
        Clutter.LOGGER.info("Registering Mod Items for " + Clutter.MOD_ID);
    }
}
