package net.github.finalproduction.rapacity.registry.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.github.finalproduction.rapacity.Rapacity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ItemGroups {
    // ItemGroups

    public static final ItemGroup RAPACITY_COMBAT = FabricItemGroupBuilder.build(new Identifier(Rapacity.MOD_ID, "combat"),
            () -> new ItemStack(ItemsRegistry.RAINBOWITE_SWORD));

    public static final ItemGroup RAPACITY_TOOLS = FabricItemGroupBuilder.build(new Identifier(Rapacity.MOD_ID, "tools"),
            () -> new ItemStack(Items.AIR));

    public static final ItemGroup RAPACITY_AUTOMATION = FabricItemGroupBuilder.build(new Identifier(Rapacity.MOD_ID, "automation"),
            () -> new ItemStack(Items.AIR));

    public static final ItemGroup RAPACITY_MISC = FabricItemGroupBuilder.build(new Identifier(Rapacity.MOD_ID, "misc"),
            () -> new ItemStack(ItemsRegistry.RAINBOWITE_INGOT));
}
