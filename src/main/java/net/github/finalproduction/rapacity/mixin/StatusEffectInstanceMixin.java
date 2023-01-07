package net.github.finalproduction.rapacity.mixin;

import net.github.finalproduction.rapacity.utils.StatusEffectAccessor;
import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(StatusEffectInstance.class)
public class StatusEffectInstanceMixin implements StatusEffectAccessor {
    @Shadow
    int duration;


    @Override
    public int getDuration() {
        return this.duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
