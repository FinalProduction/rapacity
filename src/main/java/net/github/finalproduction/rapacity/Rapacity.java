package net.github.finalproduction.rapacity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.github.finalproduction.rapacity.item.armor.RArmorRemoveHandler;
import net.github.finalproduction.rapacity.registry.items.ItemsRegistry;
import net.minecraft.entity.player.PlayerEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rapacity implements ModInitializer {
    public static final String MOD_ID = "rapacity";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ItemsRegistry.init();
        ServerEntityEvents.EQUIPMENT_CHANGE.register((livingEntity, equipmentSlot, previousStack, currentStack) -> {
            if (livingEntity instanceof PlayerEntity playerEntity
                    && previousStack.getItem() instanceof RArmorRemoveHandler armorRemover) {
                armorRemover.onRemoved(playerEntity);
            }
        });
    }
}
