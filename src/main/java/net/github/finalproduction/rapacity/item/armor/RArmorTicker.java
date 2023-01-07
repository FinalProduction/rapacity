package net.github.finalproduction.rapacity.item.armor;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public interface RArmorTicker {
    void armorTick(ItemStack stack, PlayerEntity playerEntity);
}
