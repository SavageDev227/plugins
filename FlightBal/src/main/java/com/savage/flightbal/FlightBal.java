package com.savage.flightbal;

import com.savage.flightbal.commands.ShowBal;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlightBal extends JavaPlugin {

    private static Economy econ = null;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("PLUGIN ENABLED");
        if(!setupEconomy()) {
            System.out.println("NO economy plugin found! Disabling Vault");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        getCommand("showbal").setExecutor(new ShowBal());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private boolean setupEconomy() {
        if(getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if(rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ !=null;
    }
    public static Economy getEconomy() {
        return econ;
    }
}
