package Main.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static Main.Boop.Boop.boopSend;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command!");
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("boop")) {
            if (args.length == 1) {
                boopSend(player, Bukkit.getPlayer(args[0]));
            }
            else {
                player.sendMessage(ChatColor.LIGHT_PURPLE + "[BOOP]: Recipient needed!");
            }
        }
        return true;
    }
}


