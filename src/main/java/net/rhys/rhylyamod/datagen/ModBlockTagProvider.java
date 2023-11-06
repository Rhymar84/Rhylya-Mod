package net.rhys.rhylyamod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rhys.rhylyamod.RhylyaMod;
import net.rhys.rhylyamod.block.ModBlocks;
import net.rhys.rhylyamod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RhylyaMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ROSE_GOLD_BLOCK.get(),
                        ModBlocks.DEEPSLATE_ROSE_GOLD_ORE.get(),
                        ModBlocks.ROSE_GOLD_ORE.get()

                );

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.ROSE_GOLD_ORE.get());
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.DEEPSLATE_ROSE_GOLD_ORE.get());
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.ROSE_GOLD_BLOCK.get());

    }
}
