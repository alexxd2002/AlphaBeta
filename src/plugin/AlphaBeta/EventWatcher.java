package plugin.AlphaBeta;

import org.bukkit.ChatColor;
import org.bukkit.WeatherType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class EventWatcher implements Listener {
	
	
	
	
	public EventWatcher(JavaPlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerTod(PlayerDeathEvent event) throws InterruptedException {
		Player player = event.getEntity();
		player.sendMessage(ChatColor.GREEN + "[AlphaBeta]" + ChatColor.GREEN + "Hey " + player.getDisplayName() + ", du bist ein Loooser.");
		player.sendMessage(ChatColor.YELLOW + "[AlphaBeta]" + ChatColor.AQUA +"Du bist an " + player.getFallDistance() + " M verreckt");
		player.sendMessage(ChatColor.GRAY + "[AlphaBeta]" + ChatColor.BLUE + "Gleich wird es regnen" + ":(");
		player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.AQUA + "EINE RUND MITLEID FÜR " + player.getDisplayName());
		player.setPlayerWeather(WeatherType.DOWNFALL);
		player.sendMessage(ChatColor.BOLD + "[AlphaBeta]" + ChatColor.AQUA + "Und Mitleid ist schon wieder vorbei :}");
		
		
		
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerLEVELUP(PlayerLevelChangeEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.GREEN + "[AlphaBeta]" + ChatColor.BLUE + "LEVEL UP");
		player.sendMessage(ChatColor.GREEN + "[AlphaBeta]" + ChatColor.DARK_RED + "Weiter so " + player.getDisplayName());
		player.setHealth(20);
		player.setFoodLevel(50);
		player.setPlayerWeather(WeatherType.CLEAR);
		player.getOpenInventory();
	}
	
}

