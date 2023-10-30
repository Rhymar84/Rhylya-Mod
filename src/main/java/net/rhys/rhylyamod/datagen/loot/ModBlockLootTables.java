package net.rhys.rhylyamod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.rhys.rhylyamod.block.ModBlocks;
import net.rhys.rhylyamod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ROSE_GOLD_BLOCK.get());

        this.add(ModBlocks.ROSE_GOLD_ORE.get(), block -> createOreDrop(ModBlocks.ROSE_GOLD_ORE.get(), ModItems.RAW_ROSE_GOLD.get()));
        this.add(ModBlocks.DEEPSLATE_ROSE_GOLD_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_ROSE_GOLD_ORE.get(), ModItems.RAW_ROSE_GOLD.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
