package me.astrxnomo.vozkids;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.astrxnomo.vozkids.commands.StatusCommand;

public class Main extends JavaPlugin {

    private String prefix = ChatColor.translateAlternateColorCodes('&', "&d[VozKids]");
    private String version = this.getDescription().getVersion();

    @Override
    public void onEnable() {
        this.getLogger().info(prefix + " ¡El plugin ha sido habilitado!" + " v: " + version);
        Bukkit.getServer().broadcastMessage(prefix + " ¡El plugin ha sido habilitado!" + " v: " + version);
        
        // Comandos del plugin
        this.getCommand("miComando").setExecutor(new StatusCommand());
    }

    @Override
    public void onDisable() {
        this.getLogger().info(prefix + " ¡El plugin ha sido deshabilitado!" + " v: " + version);
    }
}