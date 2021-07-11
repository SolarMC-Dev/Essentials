/* Solar start - remove whole class; split package
package net.essentialsx.api.v2.events;

import net.ess3.api.IUser;
import org.bukkit.Location;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UserTeleportSpawnEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final IUser user;
    private final IUser controller;
    private final String spawnGroup;
    private final Location target;
    private boolean cancelled = false;

    public UserTeleportSpawnEvent(final IUser user, final IUser controller, final String spawnGroup, final Location target) {
        this.user = user;
        this.controller = controller;
        this.spawnGroup = spawnGroup;
        this.target = target;
    }

    public IUser getUser() {
        return user;
    }

    public IUser getController() {
        return controller;
    }

    public String getSpawnGroup() {
        return spawnGroup;
    }

    public Location getSpawnLocation() {
        return target;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
*/ // Solar end
