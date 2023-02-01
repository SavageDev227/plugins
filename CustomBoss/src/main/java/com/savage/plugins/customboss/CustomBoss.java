package com.savage.plugins.customboss;

import com.savage.plugins.customboss.commands.BossCommand;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomBoss extends JavaPlugin {

    private World storedWorld;

    public void storeWorld(BossCommand bossCommand) {
        storedWorld = bossCommand.world;
    }
    public World getStoredWorld() {
        return storedWorld;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
