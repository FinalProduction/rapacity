package net.github.finalproduction.rapacity.item.tools.rainbowite;


import net.github.finalproduction.rapacity.item.tools.RapacityAxeItem;
import net.github.finalproduction.rapacity.registry.items.ItemGroups;
import net.github.finalproduction.rapacity.utils.RapacityToolTiers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.NotNull;

public class AxeRainbowiteItem extends RapacityAxeItem {

    public AxeRainbowiteItem() {
        super(RapacityToolTiers.RAINBOWITE, 5.0F, -3.5f, new Item.Settings().group(ItemGroups.RAPACITY_COMBAT));
    }

    @Override
    public @NotNull Rarity getRarity(@NotNull ItemStack stack) {
        return Rarity.RARE;
    }
}
