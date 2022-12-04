package com.savage.flightbal.commands;

import com.savage.flightbal.FlightBal;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ShowBal implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if (cmd.getName().equalsIgnoreCase("showbal")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                Economy eco = FlightBal.getEconomy();


                if (args.length == 0) {
                    p.sendMessage(String.format(ChatColor.GREEN + "Current Balence: " + ChatColor.GOLD + eco.format(eco.getBalance(p))));
                } else if (args.length == 1) {
                    p.sendMessage(String.format(ChatColor.GREEN + "Current Balence of player "+ args[0] + ": " + ChatColor.GOLD + eco.format(eco.getBalance(args[0]))));
                }
            }
        }

        return true;
    }
}
