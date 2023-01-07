package net.github.finalproduction.rapacity.item.tools.rainbowite;

import net.github.finalproduction.rapacity.item.tools.RapacityHoeItem;
import net.github.finalproduction.rapacity.registry.items.ItemGroups;
import net.github.finalproduction.rapacity.utils.RapacityToolTiers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.NotNull;

public class HoeRainbowiteItem extends RapacityHoeItem {

    public HoeRainbowiteItem() {
        super(RapacityToolTiers.RAINBOWITE, -4, 0.0f, new Item.Settings().group(ItemGroups.RAPACITY_TOOLS));
    }

    @Override
    public @NotNull Rarity getRarity(@NotNull ItemStack stack) {
        return Rarity.RARE;
    }
}
