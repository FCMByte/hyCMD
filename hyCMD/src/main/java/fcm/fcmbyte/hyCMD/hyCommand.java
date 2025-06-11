// FCM_Byte
package fcm.fcmbyte.hyCMD;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class hyCommand
extends JavaPlugin
implements Listener {
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)this);
    }

    @EventHandler
    public void onUnknownCommand(PlayerCommandPreprocessEvent event) {
        String cmd = event.getMessage().substring(1).split(" ")[0];
        if (this.getServer().getCommandMap().getCommand(cmd) == null) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(String.valueOf(ChatColor.WHITE) + "Unknown Command. Type \"/help\" for help. ('" + cmd + "')"); //This is what you are looking for probably.
        }
    }
}

