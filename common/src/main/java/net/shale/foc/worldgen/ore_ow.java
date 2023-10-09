package net.shale.foc.worldgen;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.utility.Couple;
import com.simibubi.create.infrastructure.worldgen.OreFeatureConfigEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import com.simibubi.create.Create;
import net.shale.foc.ExampleMod;

public class ore_ow {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ExampleMod.MOD_ID);

    public static final OreFeatureConfigEntry DRAGONSTONE_ORE =
            create("dragonstone_ore", 6, 4, -63, 70)
                    .standardDatagenExt()
                    .withBlocks(Couple.create(net.shale.foc.blocks.ores.ore_ow.DRAGONSTONE_OW, net.shale.foc.blocks.ores.ore_ow.DRAGONSTONE_DS_OW))
                    .biomeTag(BiomeTags.IS_OVERWORLD)
                    .parent();

    public static final OreFeatureConfigEntry RHODONITE_ORE =
            create("rhodonite_ore", 6, 4, -63, 70)
                    .standardDatagenExt()
                    .withBlocks(Couple.create(net.shale.foc.blocks.ores.ore_ow.RHODONITE_OW, net.shale.foc.blocks.ores.ore_ow.RHODONITE_DS_OW))
                    .biomeTag(BiomeTags.IS_OVERWORLD)
                    .parent();

    public static final OreFeatureConfigEntry AVENTURINE_ORE =
            create("aventurine_ore", 6, 4, -63, 70)
                    .standardDatagenExt()
                    .withBlocks(Couple.create(net.shale.foc.blocks.ores.ore_ow.AVENTURINE_OW, net.shale.foc.blocks.ores.ore_ow.AVENTURINE_DS_OW))
                    .biomeTag(BiomeTags.IS_OVERWORLD)
                    .parent();

    private static OreFeatureConfigEntry create(String name, int clusterSize, float frequency,
                                                int minHeight, int maxHeight) {
        ResourceLocation id = Create.asResource(name);
        OreFeatureConfigEntry configDrivenFeatureEntry = new OreFeatureConfigEntry(id, clusterSize, frequency, minHeight, maxHeight);
        return configDrivenFeatureEntry;
    }
    public static void init() {}
}
