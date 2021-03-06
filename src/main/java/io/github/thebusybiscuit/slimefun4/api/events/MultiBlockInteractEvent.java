package io.github.thebusybiscuit.slimefun4.api.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import io.github.thebusybiscuit.slimefun4.core.MultiBlock;

/**
 * This {@link Event} is called when a {@link Player} interacts with a {@link MultiBlock}.
 * 
 * @author TheBusyBiscuit
 *
 */
public class MultiBlockInteractEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private Player player;
    private MultiBlock multiBlock;
    private Block clickedBlock;
    private boolean cancelled;

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public MultiBlockInteractEvent(Player p, MultiBlock mb, Block clicked) {
        this.player = p;
        this.multiBlock = mb;
        this.clickedBlock = clicked;
    }

    /**
     * This returns the {@link Player} who interacted with our {@link MultiBlock}
     * 
     * @return The {@link Player} who interacted with the {@link MultiBlock}
     */
    public Player getPlayer() {
        return this.player;
    }

    /**
     * This method returns the {@link MultiBlock} which was interacted with.
     * 
     * @return The {@link MultiBlock} of this {@link MultiBlockInteractEvent}
     */
    public MultiBlock getMultiBlock() {
        return this.multiBlock;
    }

    public Block getClickedBlock() {
        return this.clickedBlock;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

}
