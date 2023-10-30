package net.rhys.rhylyamod.item;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rhys.rhylyamod.RhylyaMod;
import net.rhys.rhylyamod.item.custom.MilkshakeItem;
import net.rhys.rhylyamod.item.custom.ModFoods;

import java.util.Arrays;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RhylyaMod.MOD_ID);

    // ITEMS

    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ROSE_GOLD = ITEMS.register("raw_rose_gold",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().food(ModFoods.BANANA)));

    public static final RegistryObject<Item> STRAWBERRY_MILKSHAKE = ITEMS.register("strawberry_milkshake",
            () -> new MilkshakeItem(new Item.Properties(),
                    new MobEffectInstance(MobEffects.REGENERATION, 1200),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200)));
    public static final RegistryObject<Item> BANANA_MILKSHAKE = ITEMS.register("banana_milkshake",
            () -> new MilkshakeItem(new Item.Properties(),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 1200),
                    new MobEffectInstance(MobEffects.JUMP, 1200)));
    public static final RegistryObject<Item> CHOCOLATE_MILKSHAKE = ITEMS.register("chocolate_milkshake",
            () -> new MilkshakeItem(new Item.Properties(),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 1200),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 1200),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200)));

    // END OF ITEMS

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
