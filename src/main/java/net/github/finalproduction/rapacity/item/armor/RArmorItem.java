package net.github.finalproduction.rapacity.item.armor;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import net.github.finalproduction.rapacity.registry.items.ItemsRegistry;
import net.github.finalproduction.rapacity.utils.ExperienceUtils;
import net.github.finalproduction.rapacity.utils.StatusEffectAccessor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import java.util.List;

public class RArmorItem extends ArmorItem {
    public RArmorItem(ArmorMaterial material, EquipmentSlot slot) {
        this(material, slot, new Settings().group(ItemGroup.COMBAT));
    }
    public RArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings properties) {
        super(material, slot, properties);
    }
    public static void manageFeeding(PlayerEntity player, int feedCost) {
        if (player.totalExperience > feedCost) {
            HungerManager hungerManager = player.getHungerManager();
            int foodLevel = hungerManager.getFoodLevel();
            float saturation = hungerManager.getSaturationLevel();
            int maxFoodLevel = 20;
            float maxSaturation = 20.0f;
            if (foodLevel < maxFoodLevel && saturation < maxSaturation) {
                ExperienceUtils.decreaseXP(player, feedCost);
                hungerManager.setFoodLevel(foodLevel + 1);
                hungerManager.setSaturationLevel(saturation + 1);
            }
        }
    }

    public static void manageAir(PlayerEntity player, int breathingCost) {
        if (player.isSubmergedInWater()) {
            if (player.totalExperience > breathingCost) {
                int air = player.getAir();
                int maxAir = player.getMaxAir();
                if (air < maxAir) {
                    ExperienceUtils.decreaseXP(player, breathingCost);
                    player.setAir(player.getAir() + 1);
                }
            }
        }
    }

    public static void manageSpeed(PlayerEntity player, int walkSpeedCost) {
        Item legs = player.getEquippedStack(EquipmentSlot.LEGS).getItem();
        if(player.totalExperience > walkSpeedCost) {
            if(player.isSprinting()) {
            ExperienceUtils.decreaseXP(player, walkSpeedCost);
                if(legs.equals(ItemsRegistry.COSMITE_LEGGINGS)) {
                    player.getAbilities().setWalkSpeed(0.14f);
                } else if (legs.equals(ItemsRegistry.RAINBOWITE_LEGGINGS)) {
                    player.getAbilities().setWalkSpeed(0.12f);
            } else {
                    player.getAbilities().setWalkSpeed(0.1f);

                }
            }

        }
    }
    public static void manageNightVision(PlayerEntity player, int nightVisionCost) {
        if(player.isInSneakingPose()) {
            StatusEffectInstance nv = player.getStatusEffect(StatusEffects.NIGHT_VISION);
            if(player.totalExperience > nightVisionCost) {
                ExperienceUtils.decreaseXP(player, nightVisionCost);
                if(nv == null) {
                    nv = new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5, 0, false, false);
                    player.addStatusEffect(nv);
                }
                ((StatusEffectAccessor) nv).setDuration(5);
            }
        }
    }
    public static void manageSwimSpeed(PlayerEntity player, int swimSpeedCost) {
        if (player.isSwimming()) {
            StatusEffectInstance dg = player.getStatusEffect(StatusEffects.DOLPHINS_GRACE);
            if (player.totalExperience > swimSpeedCost) {
                ExperienceUtils.decreaseXP(player, swimSpeedCost);
                if (dg == null) {
                    dg = new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 5, 0, false, false);
                    player.addStatusEffect(dg);
                }
                ((StatusEffectAccessor) dg).setDuration(5);
            }
        }
    }
    public static void manageResistance(PlayerEntity player, int resistanceCost) {
        StatusEffectInstance resist = player.getStatusEffect(StatusEffects.RESISTANCE);
        if (player.totalExperience > resistanceCost) {
            ExperienceUtils.decreaseXP(player, resistanceCost);
            if (resist == null) {
                resist = new StatusEffectInstance(StatusEffects.RESISTANCE, 40, 0, false, false);
                player.addStatusEffect(resist);
            }
            ((StatusEffectAccessor) resist).setDuration(40);
        }
    }
    public static void manageFireResistance(PlayerEntity player, int resistanceCost) {
        StatusEffectInstance fireResist = player.getStatusEffect(StatusEffects.FIRE_RESISTANCE);
        if (player.totalExperience > resistanceCost) {
            if (fireResist == null) {
                fireResist = new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 40, 0, false, false);
                player.addStatusEffect(fireResist);
            }
            ((StatusEffectAccessor) fireResist).setDuration(40);
        }
    }
    public static void manageFlight(PlayerEntity player, int flightCost) {
        if (ExperienceUtils.getPlayerXP(player) > flightCost) {
            enableFlight(player);
            if (canFly(player)) {
                player.getAbilities().setFlySpeed(player.getAbilities().getWalkSpeed());
                ExperienceUtils.decreaseXP(player, flightCost);
            }
        } else {
            if (!player.isCreative() && !player.isSpectator()) {
                disableFlight(player);
            }
        }
    }

    public static boolean canFly (PlayerEntity player) {
        return player.getAbilities().allowFlying;
    }

    public static void enableFlight(PlayerEntity player) {
        enableFlight(player, true);
    }

    public static void enableFlight(PlayerEntity player, boolean allowFlying) {
        player.getAbilities().allowFlying = allowFlying;
        player.sendAbilitiesUpdate();
    }
    public static void disableFlight(PlayerEntity player) {
        player.getAbilities().allowFlying = false;
        player.getAbilities().flying = false;
        player.sendAbilitiesUpdate();
    }

    public static void manageDetox(PlayerEntity player, int detoxCost) {
        if (player.totalExperience > detoxCost) {
            List<StatusEffectInstance> effects = Lists.newArrayList(player.getStatusEffects());
            for (StatusEffectInstance potion : Collections2.filter(effects, potion -> !potion.getEffectType().isBeneficial())) {
                player.removeStatusEffect(potion.getEffectType());
                ExperienceUtils.decreaseXP(player, detoxCost);
            }
        }
    }
     public static void extinguishEntity(PlayerEntity player, int extinguishCost)   {
         if (player.isOnFire()) {
             if (player.totalExperience > extinguishCost) {
                 player.extinguish();
                 ExperienceUtils.decreaseXP(player, extinguishCost);
             }
         }
    }
}
