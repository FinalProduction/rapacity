package net.github.finalproduction.rapacity.item.armor.rainbowite;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.github.finalproduction.rapacity.item.armor.RArmorItem;
import net.github.finalproduction.rapacity.item.armor.RArmorTicker;
import net.github.finalproduction.rapacity.registry.items.ItemsRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.NotNull;

public class ItemRainbowiteArmor extends RArmorItem implements RArmorTicker {

    public final int flightCost = 1;
    public final int breathingCost = 1;
    public final int nightVisionCost = 1;
    public final int extinguishCost = 100;
    public final int detoxCost = 100;
    public final int swimSpeedCost = 1;
    public final int feedCost = 1;

    public ItemRainbowiteArmor(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof());
    }

    @Override
    public @NotNull Rarity getRarity(@NotNull ItemStack stack) {
        return Rarity.RARE;
    }

    @Override
    public void armorTick(ItemStack stack, PlayerEntity player) {
       if (player.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ItemsRegistry.RAINBOWITE_HELMET) &&
                player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(ItemsRegistry.RAINBOWITE_CHESTPLATE) &&
                player.getEquippedStack(EquipmentSlot.LEGS).getItem().equals(ItemsRegistry.COSMITE_LEGGINGS) &&
                player.getEquippedStack(EquipmentSlot.FEET).getItem().equals(ItemsRegistry.COSMITE_BOOTS)) {
            manageFlight(player, flightCost);
        }
        switch (this.slot) {
            case HEAD -> {
                manageFeeding(player, feedCost);
                manageNightVision(player, nightVisionCost);
            }
            case LEGS -> manageSwimSpeed(player, swimSpeedCost);
            default -> {
            }
        }
    }
}