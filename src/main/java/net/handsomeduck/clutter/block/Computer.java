package net.handsomeduck.clutter.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.handsomeduck.clutter.Clutter;
import net.handsomeduck.clutter.block.BlockEntity.ComputerEntity;
import net.handsomeduck.clutter.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

public class Computer extends Block implements BlockEntityProvider {
    public static final Block COMP = registerBlock(new Block(FabricBlockSettings.of(Material.GLASS).strength(4.0f).requiresTool()));

    public Computer(Settings settings) {
        super(settings);
    }

    private static Block registerBlock(Block block){
        registerBlockItem(block);
        return Registry.register(Registry.BLOCK, new Identifier(Clutter.MOD_ID, "comp"), block);
    }

    private static void registerBlockItem(Block block){
        Registry.register(Registry.ITEM, new Identifier(Clutter.MOD_ID, "comp"), new BlockItem(block, new FabricItemSettings().group(ModItemGroup.CLUT)));
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ComputerEntity(pos, state);
    }
}
