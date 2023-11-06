package net.rhys.rhylyamod.datagen;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rhys.rhylyamod.RhylyaMod;
import net.rhys.rhylyamod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RhylyaMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ROSE_GOLD_BLOCK);
        blockWithItem(ModBlocks.ROSE_GOLD_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ROSE_GOLD_ORE);

        simpleBlock(ModBlocks.ICE_CHEST.get(), new ModelFile.UncheckedModelFile(modLoc("block/ice_chest")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
