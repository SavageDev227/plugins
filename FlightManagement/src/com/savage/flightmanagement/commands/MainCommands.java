package com.savage.flightmanagement.commands;

import com.savage.flightmanagement.Main;
import com.savage.flightmanagement.gui.PolicyInventory;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class MainCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("info")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                PolicyInventory gui = new PolicyInventory();
                player.openInventory(gui.getInventory());
            }
        }
        return true;
    }
}
