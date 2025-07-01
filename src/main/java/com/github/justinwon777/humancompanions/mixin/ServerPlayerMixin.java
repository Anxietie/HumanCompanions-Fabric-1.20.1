package com.github.justinwon777.humancompanions.mixin;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.inventory.AbstractContainerMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ServerPlayer.class)
public interface ServerPlayerMixin {
    @Invoker("nextContainerCounter")
    void humancompanions$nextContainerCounterInvoker();

    @Invoker("initMenu")
    void humancompanions$initMenuInvoker(AbstractContainerMenu menu);

    @Accessor("containerCounter")
    int humancompanions$containerCounterAccessor();
}
