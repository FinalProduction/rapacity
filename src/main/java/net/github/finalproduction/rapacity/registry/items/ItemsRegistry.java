package net.github.finalproduction.rapacity.registry.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.github.finalproduction.rapacity.Rapacity;
import net.github.finalproduction.rapacity.item.armor.cosmite.ItemCosmiteArmor;
import net.github.finalproduction.rapacity.item.armor.rainbowite.ItemRainbowiteArmor;
import net.github.finalproduction.rapacity.item.misc.EpicMiscItem;
import net.github.finalproduction.rapacity.item.misc.RareMiscItem;
import net.github.finalproduction.rapacity.item.misc.UncommonMiscItem;
import net.github.finalproduction.rapacity.item.tools.rainbowite.*;
import net.github.finalproduction.rapacity.utils.RapacityArmorMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;

@SuppressWarnings("unused")
public class ItemsRegistry {

    public static final Item DIRT_SINGULARITY = registerItem("materials/singularities/dirt", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.dirt").formatted(Formatting.GOLD));
        }
    });
    public static final Item WOOD_SINGULARITY = registerItem("materials/singularities/wood", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.wood").formatted(Formatting.GOLD));
        }
    });
    public static final Item COBBLESTONE_SINGULARITY = registerItem("materials/singularities/cobblestone", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.cobblestone").formatted(Formatting.GOLD));
        }
    });
    public static final Item BASALT_SINGULARITY = registerItem("materials/singularities/basalt", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.basalt").formatted(Formatting.GOLD));
        }
    });
    public static final Item OBSIDIAN_SINGULARITY = registerItem("materials/singularities/obsidian", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.obsidian").formatted(Formatting.GOLD));
        }
    });
    public static final Item IRON_SINGULARITY = registerItem("materials/singularities/iron", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.iron").formatted(Formatting.GOLD));
        }
    });
    public static final Item COPPER_SINGULARITY = registerItem("materials/singularities/copper", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.copper").formatted(Formatting.GOLD));
        }
    });
    public static final Item DIAMOND_SINGULARITY = registerItem("materials/singularities/diamond", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.diamond").formatted(Formatting.GOLD));
        }
    });
    public static final Item GOLD_SINGULARITY = registerItem("materials/singularities/gold", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.gold").formatted(Formatting.GOLD));
        }
    });
    public static final Item EMERALD_SINGULARITY = registerItem("materials/singularities/emerald", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.emerald").formatted(Formatting.GOLD));
        }
    });
    public static final Item LAPIS_SINGULARITY = registerItem("materials/singularities/lapis", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.lapis").formatted(Formatting.GOLD));
        }
    });
    public static final Item REDSTONE_SINGULARITY = registerItem("materials/singularities/redstone", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.redstone").formatted(Formatting.GOLD));
        }
    });
    public static final Item GLOWSTONE_SINGULARITY = registerItem("materials/singularities/glowstone", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.glowstone").formatted(Formatting.GOLD));
        }
    });
    public static final Item AMETHYST_SINGULARITY = registerItem("materials/singularities/amethyst", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.amethyst").formatted(Formatting.GOLD));
        }
    });
    public static final Item NETHER_QUARTZ_SINGULARITY = registerItem("materials/singularities/nether_quartz", new UncommonMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.singularities.nether_quartz").formatted(Formatting.GOLD));
        }
    });
    public static final Item RAINBOW_CATALYST = registerItem("materials/catalysts/rainbow", new RareMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC).fireproof()) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.catalysts.rainbow").formatted(Formatting.GOLD));
        }
    });
    public static final Item RAINBOWITE_INGOT = registerItem("materials/ingots/rainbowite", new RareMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC).fireproof()) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.ingots.rainbowite").formatted(Formatting.GOLD));
        }
    });
    public static final Item COSMITE_INGOT = registerItem("materials/ingots/cosmite", new EpicMiscItem(new FabricItemSettings().group(ItemGroups.RAPACITY_MISC).fireproof()) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.materials.ingots.cosmite").formatted(Formatting.GOLD));
        }
    });
    
    // Tools

    public static final Item RAINBOWITE_PICKAXE = registerItem("tools/pickaxe/rainbowite", new PickaxeRainbowiteItem() {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.tools.pickaxe.rainbowite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item RAINBOWITE_AXE = registerItem("tools/axe/rainbowite", new AxeRainbowiteItem() {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.tools.axe.rainbowite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item RAINBOWITE_SWORD = registerItem("tools/sword/rainbowite", new SwordRainbowiteItem() {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.tools.sword.rainbowite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item RAINBOWITE_HOE = registerItem("tools/hoe/rainbowite", new HoeRainbowiteItem() {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.tools.hoe.rainbowite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item RAINBOWITE_SHOVEL = registerItem("tools/shovel/rainbowite", new ShovelRainbowiteItem() {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.tools.shovel.rainbowite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    
    //Armor

    public static final Item RAINBOWITE_HELMET = registerItem("armor/helmet/rainbowite", new ItemRainbowiteArmor(RapacityArmorMaterials.RAINBOWITE, EquipmentSlot.HEAD) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.armor.helmet.rainbowite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item COSMITE_HELMET = registerItem("armor/helmet/cosmite", new ItemCosmiteArmor(RapacityArmorMaterials.COSMITE, EquipmentSlot.HEAD) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.armor.helmet.cosmite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item RAINBOWITE_CHESTPLATE = registerItem("armor/chestplate/rainbowite", new ItemRainbowiteArmor(RapacityArmorMaterials.RAINBOWITE, EquipmentSlot.CHEST) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.armor.chestplate.rainbowite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item COSMITE_CHESTPLATE = registerItem("armor/chestplate/cosmite", new ItemCosmiteArmor(RapacityArmorMaterials.COSMITE, EquipmentSlot.CHEST) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.armor.chestplate.cosmite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item RAINBOWITE_LEGGINGS = registerItem("armor/leggings/rainbowite", new ItemRainbowiteArmor(RapacityArmorMaterials.RAINBOWITE, EquipmentSlot.LEGS) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.armor.leggings.rainbowite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item COSMITE_LEGGINGS = registerItem("armor/leggings/cosmite", new ItemCosmiteArmor(RapacityArmorMaterials.COSMITE, EquipmentSlot.LEGS) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.armor.leggings.cosmite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item RAINBOWITE_BOOTS = registerItem("armor/boots/rainbowite", new ItemRainbowiteArmor(RapacityArmorMaterials.RAINBOWITE, EquipmentSlot.FEET) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.armor.boots.rainbowite").formatted(Formatting.LIGHT_PURPLE));
        }
    });
    public static final Item COSMITE_BOOTS = registerItem("armor/boots/cosmite", new ItemCosmiteArmor(RapacityArmorMaterials.COSMITE, EquipmentSlot.FEET) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext flag) {
            tooltip.add(Text.translatable("tooltip.armor.boots.cosmite").formatted(Formatting.LIGHT_PURPLE));
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Rapacity.MOD_ID, name), item);
    }

    public static void init() {
        Rapacity.LOGGER.debug("Registering ItemsRegistry for " + Rapacity.MOD_ID);
    }
}
