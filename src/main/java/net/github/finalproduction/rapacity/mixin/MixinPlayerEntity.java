package net.github.finalproduction.rapacity.mixin;

import net.github.finalproduction.rapacity.item.armor.RArmorTicker;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class MixinPlayerEntity extends LivingEntity {
    @Shadow
    public abstract Iterable<ItemStack> getArmorItems();

    protected MixinPlayerEntity(EntityType<? extends LivingEntity> type, World world) {
        super(type, world);
    }

    @Inject(method = "tick", at = @At("HEAD"))
    public void tick(CallbackInfo info) {
        for (ItemStack stack : getArmorItems()) {
            if (!stack.isEmpty() && stack.getItem() instanceof RArmorTicker) {
                ((RArmorTicker) stack.getItem()).armorTick(stack, (PlayerEntity) (Object) this);
            }
        }
    }
}
