package net.shale.foc.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;
import net.shale.foc.ExampleMod;
import net.shale.foc.worldgen.ore_ow;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.init();
        ExampleMod.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), ExampleMod.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        //examples.REGISTRATE.register();

        net.shale.foc.blocks.ores.ore_ow.REGISTRATE.register();
        ore_ow.REGISTRATE.register();
    }
}
