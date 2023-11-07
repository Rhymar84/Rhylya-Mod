package net.rhys.rhylyamod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rhys.rhylyamod.RhylyaMod;
import net.rhys.rhylyamod.block.entity.ModBlockEntities;
import net.rhys.rhylyamod.client.IceChestRenderer;

@Mod.EventBusSubscriber(modid = RhylyaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.ICE_CHEST.get(), IceChestRenderer::new);
    }


}
