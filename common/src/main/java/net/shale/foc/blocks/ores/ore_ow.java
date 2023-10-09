package net.shale.foc.blocks.ores;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.shale.foc.ExampleMod;

public class ore_ow {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ExampleMod.MOD_ID);
    static {
        REGISTRATE.creativeModeTab(()-> CreativeModeTab.TAB_BUILDING_BLOCKS);
    }
    //metal
    public static final BlockEntry<Block> DRAGONSTONE_OW = REGISTRATE.block("ore/ow_dragonstone", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();
    public static final BlockEntry<Block> DRAGONSTONE_DS_OW = REGISTRATE.block("ore/ow_ds_dragonstone", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();

    //gems
    public static final BlockEntry<Block> RHODONITE_OW = REGISTRATE.block("ore/ow_rhodonite", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();
    public static final BlockEntry<Block> RHODONITE_DS_OW = REGISTRATE.block("ore/ow_ds_rhodonite", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();
    public static final BlockEntry<Block> AVENTURINE_OW = REGISTRATE.block("ore/ow_aventurine", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();
    public static final BlockEntry<Block> AVENTURINE_DS_OW = REGISTRATE.block("ore/ow_ds_aventurine", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();


    public static void init() {}
}
