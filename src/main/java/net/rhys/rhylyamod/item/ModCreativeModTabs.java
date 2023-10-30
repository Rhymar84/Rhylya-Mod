package net.rhys.rhylyamod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rhys.rhylyamod.RhylyaMod;
import net.rhys.rhylyamod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RhylyaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RHYLYA_TAB =
            CREATIVE_MODE_TABS.register("rhylya_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ROSE_GOLD_INGOT.get()))
                            .title(Component.translatable("creativetab.rhylya_tab"))

                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.RAW_ROSE_GOLD.get());
                                pOutput.accept(ModItems.ROSE_GOLD_INGOT.get());

                                pOutput.accept(ModBlocks.ROSE_GOLD_ORE.get());
                                pOutput.accept(ModBlocks.DEEPSLATE_ROSE_GOLD_ORE.get());
                                pOutput.accept(ModBlocks.ROSE_GOLD_BLOCK.get());

                                pOutput.accept(ModItems.STRAWBERRY.get());
                                pOutput.accept(ModItems.BANANA.get());
                                pOutput.accept(ModItems.STRAWBERRY_MILKSHAKE.get());
                                pOutput.accept(ModItems.BANANA_MILKSHAKE.get());
                                pOutput.accept(ModItems.CHOCOLATE_MILKSHAKE.get());
                            })

                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
