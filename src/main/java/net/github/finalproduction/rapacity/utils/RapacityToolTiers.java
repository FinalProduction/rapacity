package net.github.finalproduction.rapacity.utils;


import net.github.finalproduction.rapacity.registry.items.ItemsRegistry;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;
public enum RapacityToolTiers implements ToolMaterial {
    RAINBOWITE(999999999, 9999, 9.0f, 144.0f, 25, () -> Ingredient.ofItems(ItemsRegistry.RAINBOWITE_INGOT));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    private RapacityToolTiers(int j, int k, float f, float g, int l, Supplier<Ingredient> repairIngredient) {
        this.level = j;
        this.uses = k;
        this.speed = f;
        this.damage = g;
        this.enchantmentValue = l;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.uses;
    }

    public float getMiningSpeedMultiplier() {
        return this.speed;
    }

    public float getAttackDamage() {
        return this.damage;
    }

    public int getMiningLevel() {
        return this.level;
    }

    public int getEnchantability() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}