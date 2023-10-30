package com.starfish_studios.hearth_and_home.event.forge;

import com.starfish_studios.hearth_and_home.registry.HNHFurnaceFuelRegistry;
import net.minecraftforge.event.OnDatapackSyncEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class DatapackSyncEvent {

    @SubscribeEvent
    public static void onDatapackSync(OnDatapackSyncEvent event) {
        HNHFurnaceFuelRegistry.init();
    }
}
