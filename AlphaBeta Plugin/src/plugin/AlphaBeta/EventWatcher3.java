package plugin.AlphaBeta;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EventWatcher3 implements Listener {
	
	public EventWatcher3(JavaPlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerSchlaf(PlayerBedEnterEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.GREEN + "[AlphaBeta]" + ChatColor.GREEN + "Gute Nacht " + player.getDisplayName() + " :)");
		
		
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerErwacht(PlayerBedEnterEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.GREEN + "[AlphaBeta]" + ChatColor.GREEN + "Guten Morgen " + player.getDisplayName() + " :)");
		
	}
	
	
}
