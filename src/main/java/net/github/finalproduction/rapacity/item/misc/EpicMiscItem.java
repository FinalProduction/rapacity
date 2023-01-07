package net.github.finalproduction.rapacity.item.misc;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.NotNull;

public class EpicMiscItem extends Item {
    public EpicMiscItem(FabricItemSettings settings) {
        super(settings);
    }

    @Override
    public @NotNull Rarity getRarity(@NotNull ItemStack stack) {
        return Rarity.EPIC;
    }
}
