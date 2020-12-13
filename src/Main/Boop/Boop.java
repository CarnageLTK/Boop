package Main.Boop;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Boop {
    public static void boopSend(Player sender, Player receiver){
        if (receiver == null) {
            sender.sendMessage(ChatColor.LIGHT_PURPLE + "[BOOP]: Player is not online!");
        }
        else {
            receiver.sendMessage(ChatColor.LIGHT_PURPLE + "[BOOP]: " + sender.getDisplayName() + " has BOOPED you!");
            sender.sendMessage(ChatColor.LIGHT_PURPLE + "[BOOP]: " + receiver.getDisplayName() + " has been BOOPED!");
        }
    }
}
