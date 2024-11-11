package com.github.sirmega;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "startermod", useMetadata=true)
public class StarterMod {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new EventHandlers());
        MinecraftForge.EVENT_BUS.register(this);
    }
}
