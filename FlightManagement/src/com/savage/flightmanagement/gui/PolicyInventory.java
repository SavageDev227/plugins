package com.savage.flightmanagement.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolicyInventory implements InventoryHolder {

    private final Inventory inv;

    public PolicyInventory() {
        inv = Bukkit.createInventory(this, 27, "Info/Tps"); //54 max size
        init();
    }

    private void init() {

        ItemStack item;

        for (int i = 0; i < 9; i++) {
            item = createItem(" ", Material.RED_STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }

        for (int e = 18; e < 27; e++) {
            item = createItem(" ", Material.RED_STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(e, item);
        }


        item = createItem("§lVote", Material.GOLD_BLOCK, Collections.singletonList("§lShows voting sites"));
            //inv.addItem(item); -- Don't use! Panes will pile into one slot
        inv.setItem(9, item);

        item = createItem("§lPvp", Material.NETHERITE_SWORD, Collections.singletonList("§lWarps to pvp"));
        //inv.addItem(item); -- Don't use! Panes will pile into one slot
        inv.setItem(10, item);

        item = createItem("§lAnniversary", Material.CAKE, Collections.singletonList("§lWarps to anniversary build"));
        //inv.addItem(item); -- Don't use! Panes will pile into one slot
        inv.setItem(11, item);

        item = createItem("§lEnd", Material.END_STONE, Collections.singletonList("§lWarps to the end"));
        //inv.addItem(item); -- Don't use! Panes will pile into one slot
        inv.setItem(17, item);

        item = createItem("§lSpawn", Material.NETHERITE_PICKAXE, Collections.singletonList("§lWarps to spawn"));
        //inv.addItem(item); -- Don't use! Panes will pile into one slot
        inv.setItem(12, item);

        item = createItem("§lShops", Material.PAPER, Collections.singletonList("§lWarps to shops"));
        //inv.addItem(item); -- Don't use! Panes will pile into one slot
        inv.setItem(14, item);

        item = createItem("§l1v1", Material.DIAMOND_SWORD, Collections.singletonList("§lWarps to 1v1"));
        //inv.addItem(item); -- Don't use! Panes will pile into one slot
        inv.setItem(15, item);


        item = createItem("§b§lRules", Material.BOOK, Collections.singletonList("§lReads the rules"));
        inv.setItem(13, item);

        item = createItem("§lDiscord", Material.EMERALD_BLOCK, Collections.singletonList("§lShows Discord link"));
        inv.setItem(16, item);


    }

    private ItemStack createItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}