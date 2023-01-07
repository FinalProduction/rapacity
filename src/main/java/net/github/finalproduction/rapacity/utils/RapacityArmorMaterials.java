package net.github.finalproduction.rapacity.utils;

import net.github.finalproduction.rapacity.registry.items.ItemsRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum RapacityArmorMaterials implements ArmorMaterial {

    //Modified Vanilla ArmorMaterials Class so that I can have greater control over Durability.
    RAINBOWITE("rainbowite", new int[]{9999, 9999, 9999, 9999}, new int[]{48, 96, 128, 48}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 48.0F, 0.16F, () -> Ingredient.ofItems(ItemsRegistry.RAINBOWITE_INGOT)),
    COSMITE("cosmite", new int[]{99999, 99999, 99999, 99999}, new int[]{96, 192, 256, 96}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 96.0F, 0.32F, () -> Ingredient.ofItems(ItemsRegistry.COSMITE_INGOT));

    private final String name;
    private final int[] slotDurability;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private RapacityArmorMaterials(String name, int[] a, int[] b, int c, SoundEvent soundEvent, float d, float e, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.slotDurability = a;
        this.slotProtections = b;
        this.enchantmentValue = c;
        this.sound = soundEvent;
        this.toughness = d;
        this.knockbackResistance = e;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability(EquipmentSlot equipmentSlot) {
        return slotDurability[equipmentSlot.getEntitySlotId()];
    }

    public int getProtectionAmount(EquipmentSlot equipmentSlot) {
        return this.slotProtections[equipmentSlot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
