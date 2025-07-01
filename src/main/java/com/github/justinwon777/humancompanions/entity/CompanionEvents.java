package com.github.justinwon777.humancompanions.entity;

import com.github.justinwon777.humancompanions.HumanCompanions;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.world.entity.player.Player;

public class CompanionEvents {
    public static void registerEvents() {
        companionKillsMob();
        companionFriendlyFire();
    }

    private static void companionKillsMob() {
        ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register((world, entity, killedEntity) -> {
            if (entity instanceof AbstractHumanCompanionEntity companion) {
                companion.giveExperiencePoints(killedEntity.getExperienceReward());
            }
        });
    }

    private static void companionFriendlyFire() {
        ServerLivingEntityEvents.ALLOW_DAMAGE.register((entity, source, amount) -> {
            if (source.getEntity() != null && source.getEntity() instanceof AbstractHumanCompanionEntity) {
                if (entity instanceof AbstractHumanCompanionEntity attackedCompanion && attackedCompanion.isTame()) {
                    return HumanCompanions.getConfig().FRIENDLY_FIRE_COMPANIONS;
                } else if (entity instanceof Player) {
                    return HumanCompanions.getConfig().FRIENDLY_FIRE_PLAYER;
                }
            }

            return true;
        });
    }

    /*
    // player can always damage companion
    public static void playerAttacksCompanion() {
        // check if player hit companion
        AttackEntityCallback.EVENT.register((player, level, interactionHand, entity, entityHitResult) -> {
            // pass if player is in spectator mode, the attacked entity is not a companion, the companion is not tame, or the companion's owner isn't the attacking player
            if (player.isSpectator() ||
                    !(entity instanceof AbstractHumanCompanionEntity companion) ||
                    !(companion.isTame() && companion.isOwnedBy(player)) ||
                    !HumanCompanions.getConfig().FRIENDLY_FIRE_PLAYER)
            {
                return InteractionResult.PASS;
            }

            return InteractionResult.SUCCESS;
        });
    }
    */
}
