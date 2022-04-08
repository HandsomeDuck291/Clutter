package net.handsomeduck.clutter.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.handsomeduck.clutter.Clutter;
import net.handsomeduck.clutter.block.Computer;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.example.registry.RegistryUtils;
import software.bernie.geckolib3.GeckoLib;

public class BlockRegistry {
    public static <B extends Block> B registerBlock(String name, B block) {
        return Registry.register(Registry.BLOCK, new Identifier(Clutter.MOD_ID, name), block);
    }

    public static final Block COMP = registerBlock("comp", new Computer());
    public static final Block RUBY_ORE = registerBlock("ruby_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));

    public static void registerModBlocks(){
        Clutter.LOGGER.info("Registering Mod Blocks for " + Clutter.MOD_ID);
    }
}
