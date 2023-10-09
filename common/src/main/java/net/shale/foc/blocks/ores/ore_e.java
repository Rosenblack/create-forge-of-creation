package net.shale.foc.blocks.ores;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import static com.simibubi.create.Create.REGISTRATE;

public class ore_e {
    public static final BlockEntry<Block> DRAGONSTONE_E = REGISTRATE.block("ore/e_dragonstone", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();
}
