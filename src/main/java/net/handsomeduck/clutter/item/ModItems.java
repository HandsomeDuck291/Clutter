package net.handsomeduck.clutter.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.handsomeduck.clutter.Clutter;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item RUBY = registerItem( "ruby", new Item(new FabricItemSettings().group(ModItemGroup.CLUT)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Clutter.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Clutter.LOGGER.info("Registering Mod Items for" + Clutter.MOD_ID);
    }

}
