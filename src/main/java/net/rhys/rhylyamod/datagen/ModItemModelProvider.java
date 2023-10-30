package net.rhys.rhylyamod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rhys.rhylyamod.RhylyaMod;
import net.rhys.rhylyamod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RhylyaMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BANANA);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.STRAWBERRY_MILKSHAKE);
        simpleItem(ModItems.BANANA_MILKSHAKE);
        simpleItem(ModItems.CHOCOLATE_MILKSHAKE);

        simpleItem(ModItems.ROSE_GOLD_INGOT);
        simpleItem(ModItems.RAW_ROSE_GOLD);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RhylyaMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
