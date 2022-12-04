package com.savage.flightmanagement.events;

import com.savage.flightmanagement.Main;
import com.savage.flightmanagement.gui.PolicyInventory;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class InventoryEvents implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) { return; }
        if (e.getClickedInventory().getHolder() instanceof PolicyInventory) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            if (e.getCurrentItem() == null) { return; }
            if (e.getCurrentItem().getType() == Material.EMERALD_BLOCK) {
                player.closeInventory();
                player.performCommand("discord");
            }
            else if (e.getSlot() == 17) {
                player.closeInventory();
                player.performCommand("warp end");
            }
            else if (e.getCurrentItem().getType() == Material.BOOK) {
                player.performCommand("rules");
                player.closeInventory();
            }
            else if (e.getCurrentItem().getType() == Material.NETHERITE_PICKAXE) {
                player.performCommand("spawn");
                player.closeInventory();
            }
            else if (e.getCurrentItem().getType() == Material.PAPER) {
                player.performCommand("warp shops");
                player.closeInventory();
            }
            else if (e.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
                player.performCommand("warp 1v1");
                player.closeInventory();
            }
            else if (e.getCurrentItem().getType() == Material.GOLD_BLOCK) {
                player.performCommand("vote all");
                player.closeInventory();
            }
            else if (e.getCurrentItem().getType() == Material.NETHERITE_SWORD) {
                player.performCommand("warp pvp");
                player.closeInventory();
            }
            else if (e.getCurrentItem().getType() == Material.CAKE) {
                player.performCommand("warp anniversary");
                player.closeInventory();
            }

        }

    }

}
