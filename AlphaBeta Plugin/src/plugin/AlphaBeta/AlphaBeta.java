package plugin.AlphaBeta;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;



public class AlphaBeta extends JavaPlugin {

	

	private static final Plugin plugin = null;



	@Override
	public void onEnable() {
		super.onEnable();
		
		//Automatisches Update des Textes 
		
		String pluginName = this.getDescription().getName();
		String pluginversion = this.getDescription().getVersion();
		
		new EventWatcher(this);
		
	    new EventWatcher2(this);
	    
	    new EventWatcher3(this);
	    
	    new EventWatcher4(this);
	    
	    
		
		System.out.println(pluginName + " Plugin Version " + pluginversion + " gestartet.");
		
		
	
	}
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		//Wenn Sender = Player, wird  Sender zum Player
		Player player = null;
		if(sender instanceof Player) {
			player = (Player) sender;
		
		}
		
		
		
		//Kommandos
		//Kommando "fini.obj"
		
		if(command.getName() .equalsIgnoreCase("fini.obj")) {
			
			String pluginversion = this.getDescription().getVersion();
			
			if(player == null) {
				
				sender.sendMessage("[Error 5087] Command fini.obj not in libraries (not found) Please try again");
				return true;
				
			} else {
				
				player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.DARK_RED + "Hallo " + player.getDisplayName() + " der Parameter HISTORY wird gelöscht");
				player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.GREEN + "AlphaBeta Version " + ChatColor.DARK_AQUA + pluginversion + " REBOOTING");
				player.setGameMode(GameMode.SURVIVAL);
				
				return true;
			}
			
		}
		
	
			//Kommando "AlphaBeta"
			if(command.getName() .equalsIgnoreCase("AlphaBeta")) {
				
				String pluginversion = this.getDescription().getVersion();
				
				if(player == null) {
					
					sender.sendMessage("[AlphaBeta]" + "AlphaBeta Version " + pluginversion);
					sender.sendMessage("[AlphaBeta]" + "Ein Plugin von Alexander Meinecke");
					return true;
					
				} else {
					
					player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.DARK_RED + "Hallo " + player.getDisplayName());
					player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.GREEN + "AlphaBeta Version " + ChatColor.DARK_AQUA + pluginversion);
					player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.RED + "Ein Plugin von Alexander Meinecke");
					
					return true;
				}
				
			}
		        //Kommando wht_rab.obj
				if(command.getName() .equalsIgnoreCase("wht_rab.obj")) {
				
				if(player == null) {
					
					sender.sendMessage("[Error 5087] Command wht_rab.obj not in libraries (not found) Please try again");
					return true;
					
				} else {
					
					player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.DARK_RED + "Hallo " + player.getDisplayName() + ". Du hast den Master Kommand benutzt!!!" + ChatColor.GOLD + " Mit freundlichen grüßen AlphaBeta");
					player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.GREEN + "AlphaBeta gibt dir nun dein Pack...");
					player.setGameMode(GameMode.CREATIVE);
				
					
		}
			}
				
				//Kommando "transit"
				if(command.getName().equalsIgnoreCase("transit")) {
					
					if(player == null) {
						
						sender.sendMessage("[AlphaBeta]" + " DER TRANSIT-BEFEHL KANN NUR VON SPIELERN genutzt WERDEN!!! (Siehe Quellcode))");
						return true;
						
					} else {
					
					if(args.length != 1) {
						return false;
					}
					
					for(Player curPlayers : this.getServer().getOnlinePlayers()) {
						if(curPlayers.getName().equalsIgnoreCase(args[0])) {
							player.sendMessage(ChatColor.ITALIC + "[AlphaBeta]" + ChatColor.WHITE +"Beame...");
							curPlayers.sendMessage(ChatColor.RED + "[AlphaBeta]" + ChatColor.ITALIC +"Spieler " + player.getDisplayName() + " wird zu " + curPlayers.getDisplayName() + " teleportieret." );
							curPlayers.sendMessage(ChatColor.RED + "[AlphaBeta]" + ChatColor.BLUE + "IN 15 SEKUNDEN!!");
							
							new BukkitRunnable() {
								Player player = null;
								private CommandSender plugin2;
								
					            
					            @Override
					            
					            public void run() {
					                plugin2 = null;
					                
									// What you want to schedule goes here
					                plugin2.getServer().broadcastMessage("COMMANDO nach 15 sekunden ausführen");
									
					               player.teleport(curPlayers.getLocation());
					               player.sendMessage(ChatColor.BOLD + "[AlphaBeta]" + ChatColor.GOLD + "Du wurdest zu " + curPlayers.getDisplayName() + " teleportiert");
					            }
					            
					        }.runTaskLater(AlphaBeta.plugin, 20);
							
					        
							
							player.teleport(curPlayers.getLocation());
							player.sendMessage(ChatColor.BOLD + "[AlphaBeta]" + ChatColor.GOLD + "Du wurdest zu " + curPlayers.getDisplayName() + " teleportiert" );
							return true;
						}

					}
					
					
					player.sendMessage(ChatColor.BLUE + "[AlphaBeta]" + ChatColor.DARK_RED + "Tut mir leid " + player.getDisplayName() + " aber " + args[0] + " konnte nicht auf dem Server gefunden werden...");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[AlphaBeta]" + ChatColor.YELLOW + "Versuche es später vielleicht noch einmal...");
					return true;
					
					}
				}
				
				
		return true;
	}


}