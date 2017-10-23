package plugin.AlphaBeta;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEditBookEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EventWatcher4 implements Listener {
	
	public EventWatcher4(JavaPlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerBook(PlayerEditBookEvent event) throws InterruptedException {
	Player player = event.getPlayer();
		player.sendMessage(ChatColor.AQUA + "[AlphaBeta]" + ChatColor.GREEN + "Na schreibst du etwas schönes??? ;) ");	
		player.sendMap(null);
	
		
		 
	}
		
}
