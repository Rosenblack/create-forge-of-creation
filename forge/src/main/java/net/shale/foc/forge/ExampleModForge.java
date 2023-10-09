package net.shale.foc.forge;

import net.shale.foc.ExampleMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.shale.foc.worldgen.ore_ow;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //examples.REGISTRATE.registerEventListeners(eventBus);
        ExampleMod.init();

        net.shale.foc.blocks.ores.ore_ow.REGISTRATE.registerEventListeners(eventBus);
        ore_ow.REGISTRATE.registerEventListeners(eventBus);
    }
}
