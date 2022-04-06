package net.handsomeduck.clutter.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.handsomeduck.clutter.Clutter;
import net.handsomeduck.clutter.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Clutter.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(Clutter.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ModItemGroup.CLUT)));
    }

    public static void registerModBlocks(){
        Clutter.LOGGER.info("Registering Mod Blocks for" + Clutter.MOD_ID);
    }
}
