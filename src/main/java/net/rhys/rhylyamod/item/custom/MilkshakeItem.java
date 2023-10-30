package net.rhys.rhylyamod.item.custom;

import com.google.common.collect.ImmutableList;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class MilkshakeItem extends MilkBucketItem {

    @Nullable
    private final ImmutableList<MobEffectInstance> effects;

    public MilkshakeItem(Properties pProperties, MobEffectInstance... pEffects) {
        super(pProperties);
        this.effects = ImmutableList.copyOf(pEffects);
    }

    @Override
    public ItemStack finishUsingItem(final ItemStack pStack, final Level pLevel, final LivingEntity pEntityLiving) {
        if (!pLevel.isClientSide) {
            for(MobEffectInstance mobeffectinstance : this.getEffects()) {
                if (mobeffectinstance.getEffect().isInstantenous()) {
                    mobeffectinstance.getEffect().applyInstantenousEffect(pEntityLiving, null, pEntityLiving, mobeffectinstance.getAmplifier(), 1.0D);
                } else {
                    pEntityLiving.addEffect(new MobEffectInstance(mobeffectinstance));
                }
            }

        }

        if (pEntityLiving instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, pStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (pEntityLiving instanceof Player && !((Player)pEntityLiving).getAbilities().instabuild) {
            pStack.shrink(1);
        }


        return pStack.isEmpty() ? new ItemStack(Items.BUCKET) : pStack;
    }

    private ImmutableList<MobEffectInstance> getEffects() {
        return this.effects;
    }
}

