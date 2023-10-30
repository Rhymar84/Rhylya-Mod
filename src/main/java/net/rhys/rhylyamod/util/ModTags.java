package net.rhys.rhylyamod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.rhys.rhylyamod.RhylyaMod;

public class ModTags {
    public static class Blocks{

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(RhylyaMod.MOD_ID, name));
        }
    }

    public static class Items {

    }
}
