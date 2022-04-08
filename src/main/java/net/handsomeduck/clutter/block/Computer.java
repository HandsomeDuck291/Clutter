package net.handsomeduck.clutter.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.handsomeduck.clutter.Clutter;
import net.handsomeduck.clutter.block.BlockEntity.ComputerEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

public class Computer extends Block implements BlockEntityProvider {

    public Computer() {
        super(AbstractBlock.Settings.of(Material.STONE).nonOpaque());
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ComputerEntity(pos, state);
    }
}
