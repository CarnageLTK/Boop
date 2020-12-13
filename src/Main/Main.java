package Main;

import Main.command.Commands;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[BOOP]: PLUGIN IS ENABLED");
        getCommand("boop").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[BOOP]: PLUGIN IS DISABLED");
    }
}