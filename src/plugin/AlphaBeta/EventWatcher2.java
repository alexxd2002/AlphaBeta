package plugin.AlphaBeta;


import org.bukkit.ChatColor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EventWatcher2 implements Listener {

	
	public EventWatcher2(JavaPlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.LIGHT_PURPLE + "Hallo " + player.getDisplayName() + ", willkommen auf einem AlphaBeta Server.");
		player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.RED + "Gib AlphaBeta ein um Infos zu bekommen.");
		player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.YELLOW + "Du hast " + player.getHealth() + " Leben.");
		
	
	}


}


