package net.rhys.rhylyamod.item.custom;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().fast()
            .nutrition(2).saturationMod(0.2f).build();
    public static final FoodProperties BANANA = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.3f).build();

}
