package net.github.finalproduction.rapacity.item.armor.cosmite;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.github.finalproduction.rapacity.item.armor.RArmorItem;
import net.github.finalproduction.rapacity.item.armor.RArmorRemoveHandler;
import net.github.finalproduction.rapacity.item.armor.RArmorTicker;
import net.github.finalproduction.rapacity.registry.items.ItemsRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.NotNull;


public class ItemCosmiteArmor extends RArmorItem implements RArmorTicker, RArmorRemoveHandler {
    public final int flightCost = 1;
    public final int breathingCost = 1;
    public final int resistanceCost = 1;
    public final int swimSpeedCost = 1;
    public final int nightVisionCost = 1;
    public final int feedCost = 5;
    public final int extinguishCost = 100;

    public final int walkSpeedCost = 1;
    public final int detoxCost = 100;

    public ItemCosmiteArmor(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof());
    }

    @Override
    public @NotNull Rarity getRarity(@NotNull ItemStack stack) {
        return Rarity.EPIC;
    }

    @Override
    public void armorTick(ItemStack stack, PlayerEntity player) {
       if (!player.world.isClient) {
            Item head = player.getEquippedStack(EquipmentSlot.HEAD).getItem();
            Item chest = player.getEquippedStack(EquipmentSlot.CHEST).getItem();
            Item legs = player.getEquippedStack(EquipmentSlot.LEGS).getItem();
            Item feet = player.getEquippedStack(EquipmentSlot.FEET).getItem();
            if (head.equals(ItemsRegistry.COSMITE_HELMET) &&
                    chest.equals(ItemsRegistry.COSMITE_CHESTPLATE) &&
                    legs.equals(ItemsRegistry.COSMITE_LEGGINGS) &&
                    feet.equals(ItemsRegistry.COSMITE_BOOTS)) {
                manageFlight(player, flightCost);
                manageResistance(player, resistanceCost);
                manageDetox(player, detoxCost);
            } else {
                // Disable flight if player can fly but doesn't have all pieces of the armor equipped.
                if (!player.isCreative() && !player.isSpectator() && canFly(player)) {
                    disableFlight(player);
                }
            }
            switch (this.slot) {
                case HEAD -> {
                    manageFeeding(player, feedCost);
                    manageNightVision(player, nightVisionCost);
                    manageAir(player, breathingCost);
                }
                case LEGS -> {
                    manageSwimSpeed(player, swimSpeedCost);
                    manageSpeed(player, walkSpeedCost);
                }
                default -> {
                }
            }
        }
    }

    @Override
    public void onRemoved(PlayerEntity player) {

    }
}