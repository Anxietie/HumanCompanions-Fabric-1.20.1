package com.github.justinwon777.humancompanions.container;

import com.github.justinwon777.humancompanions.HumanCompanions;
import com.github.justinwon777.humancompanions.entity.AbstractHumanCompanionEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class CompanionContainer extends AbstractContainerMenu {
    private final Container container;
    private final int companionID;
    // private @Nullable AbstractHumanCompanionEntity companion;
    private final int containerRows;

    public CompanionContainer(int syncID, Inventory playerInventory, FriendlyByteBuf buf) {
        this(syncID, playerInventory, new SimpleContainer(buf.readInt()), buf.readInt());
    }

    public CompanionContainer(int syncID, Inventory playerInventory, Container companionInventory, int companionID) {
        super(HumanCompanions.COMPANION_CONTAINER_MENU_TYPE, syncID);
        this.companionID = companionID;
        checkContainerSize(companionInventory, 3 * 9);
        this.container = companionInventory;
        this.containerRows = 3;
        companionInventory.startOpen(playerInventory.player);
        int i = (this.containerRows - 4) * 18;

        for (int j = 0; j < this.containerRows; ++j) {
            for (int k = 0; k < 9; ++k) {
                this.addSlot(new Slot(companionInventory, k + j * 9, 8 + k * 18, 18 + j * 18));
            }
        }

        for (int l = 0; l < 3; ++l) {
            for (int j1 = 0; j1 < 9; ++j1) {
                this.addSlot(new Slot(playerInventory, j1 + l * 9 + 9, 8 + j1 * 18, 103 + l * 18 + i));
            }
        }

        for (int i1 = 0; i1 < 9; ++i1) {
            this.addSlot(new Slot(playerInventory, i1, 8 + i1 * 18, 161 + i));
        }

    }

    public boolean stillValid(Player p_39242_) {
        return this.container.stillValid(p_39242_);
    }

    public ItemStack quickMoveStack(Player p_39253_, int p_39254_) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(p_39254_);
        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (p_39254_ < this.containerRows * 9) {
                if (!this.moveItemStackTo(itemstack1, this.containerRows * 9, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 0, this.containerRows * 9, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        return itemstack;
    }

    public void removed(Player player) {
        super.removed(player);
        this.container.stopOpen(player);
    }

    public int getRowCount() {
        return this.containerRows;
    }

    public int getCompanionID() {
        return this.companionID;
    }
}
