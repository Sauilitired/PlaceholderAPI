/*
 *
 * PlaceholderAPI
 * Copyright (C) 2018 Ryan McCarthy
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */
package me.clip.placeholderapi.events;

import me.clip.placeholderapi.PlaceholderHook;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Deprecated @SuppressWarnings("unused") public class PlaceholderHookUnloadEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final String plugin;
    private final PlaceholderHook hook;

    public PlaceholderHookUnloadEvent(final String plugin, final PlaceholderHook placeholderHook) {
        this.plugin = plugin;
        this.hook = placeholderHook;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override public HandlerList getHandlers() {
        return HANDLERS;
    }

    public String getHookName() {
        return this.plugin;
    }

    public PlaceholderHook getHook() {
        return this.hook;
    }
}
