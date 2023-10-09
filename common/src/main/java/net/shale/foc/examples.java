package net.shale.foc;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class examples {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ExampleMod.MOD_ID);
    static {
        REGISTRATE.creativeModeTab(()-> CreativeModeTab.TAB_DECORATIONS);
    }
    public static final ItemEntry<Item> TEST_ITEM = REGISTRATE.item("test_item", Item::new)
            .register();

    public static final BlockEntry<Block> TEST_BLOCK = REGISTRATE.block("test_block", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .item()
            .build()
            .register();

    public static void init() {}
}
