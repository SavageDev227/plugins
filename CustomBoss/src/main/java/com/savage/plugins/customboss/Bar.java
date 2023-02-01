package com.savage.plugins.customboss;

import com.savage.plugins.customboss.commands.BossCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class Bar {

    CustomBoss customBoss = new CustomBoss();

    Bar barClass = new Bar(customBoss);
    BossCommand cmd = new BossCommand(barClass);

    String nameValue = cmd.getName();

    BarColor colorValue = cmd.getColor();



    private int taskID = -1;
    private CustomBoss plugin;
    private BossBar bar;

    private LivingEntity mob;

    public Bar(CustomBoss plugin) {
        this.plugin = plugin;
    }

    public void addPlayer(Player player) {
        bar.addPlayer(player);
    }

    public BossBar getBar(Player player) {
        return bar;
    }

    public void createBar() {
        bar = Bukkit.createBossBar(nameValue, colorValue, BarStyle.SOLID);
        bar.setVisible(true);
    }

    public void onMobSpawn(LivingEntity spawnedMob) {
        this.mob = spawnedMob;
        bar.addPlayer(mob.getKiller());
        bar.setVisible(true);
        bar.setProgress(mob.getHealth() / mob.getMaxHealth());
    }

    private String format(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
