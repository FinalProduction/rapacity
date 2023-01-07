package net.github.finalproduction.rapacity.item.tools.rainbowite;

import net.github.finalproduction.rapacity.item.tools.RapacitySwordItem;
import net.github.finalproduction.rapacity.registry.items.ItemGroups;
import net.github.finalproduction.rapacity.utils.RapacityToolTiers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.NotNull;

public class SwordRainbowiteItem extends RapacitySwordItem {

    public SwordRainbowiteItem() {
        super(RapacityToolTiers.RAINBOWITE, 3, -2.4f, new Item.Settings().group(ItemGroups.RAPACITY_COMBAT));
    }

    @Override
    public @NotNull Rarity getRarity(@NotNull ItemStack stack) {
        return Rarity.RARE;
    }
}
