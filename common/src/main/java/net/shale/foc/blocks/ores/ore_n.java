package net.shale.foc.blocks.ores;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.shale.foc.ExampleMod;

public class ore_n {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ExampleMod.MOD_ID);
    static {
        REGISTRATE.creativeModeTab(()-> CreativeModeTab.TAB_BUILDING_BLOCKS);
    }
    //ores
    public static final BlockEntry<Block> DRAGONSTONE_N = REGISTRATE.block("ore/n_dragonstone", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();
    //gems
    public static final BlockEntry<Block> BISMUTH_BL = REGISTRATE.block("ore/bl_bismuth", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();
    public static final BlockEntry<Block> BISMUTH_BA = REGISTRATE.block("ore/ba_bismuth", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();


    public static void init() {}
}
