package com.savage.flightmanagement;

import com.savage.flightmanagement.commands.MainCommands;
import com.savage.flightmanagement.events.InventoryEvents;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {
        MainCommands cmds = new MainCommands();
        getServer().getPluginManager().registerEvents(new InventoryEvents(), this);
        getCommand("info").setExecutor(cmds);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[FlightManagement v1.4]: Plugin Enabled");
    }



    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[FlightManagement]: Plugin Disabled");
    }







}
