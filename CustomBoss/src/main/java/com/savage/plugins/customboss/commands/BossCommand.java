package com.savage.plugins.customboss.commands;

import com.savage.plugins.customboss.Bar;
import com.savage.plugins.customboss.CustomBoss;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.boss.BarColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;

public class BossCommand implements CommandExecutor {


    public World world = null;
    private String oldName;
    private String newName;

    public BossCommand(String oldName, String newName, Bar bar) {
        this.oldName = oldName;
        this.newName = newName;
        this.bar = bar;
    }
    public void setWorld(World w) {
        this.world = w;
    }
    private final Bar bar;
    public BossCommand(Bar bar) {
        this.bar = bar;
    }

    CustomBoss customBoss = new CustomBoss();
    private String name;

    private BarColor color;

    public BarColor getColor() {
        return color;
    }

    public void setColor(BarColor color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Entity mob;

    public Entity getMob() {
        return mob;
    }

    public void setMob(Entity mob)  {
        this.mob = mob;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        Location loc = p.getLocation();
        if(cmd.getName().equalsIgnoreCase("createboss")) {
            if(sender instanceof Player) {
                if (args.length == 0) {
                    p.sendMessage(ChatColor.RED + "Invalid Syntax! Please use: /createboss [mob] [name] [bar color] [health] [damage]");

                }
                else if(args.length == 1) {
                    p.getWorld().spawnEntity(loc, EntityType.valueOf(args[0])).setCustomName(args[1]);
                }
                else if(args.length == 2) {
                    setName(args[1]);
                }
                else if(args.length == 3) {
                    setColor(BarColor.valueOf(args[3].toUpperCase()));
                }
                else if(args.length == 4) {
                    for (Entity entity : world.getEntities()) {
                        if (entity.getCustomName().equalsIgnoreCase(args[1])) {
                            if(EntityType = mob) {

                            }
                            break;
                        }
                    }
                }
            }
        }
        return true;
    }
}
