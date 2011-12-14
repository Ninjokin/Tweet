package tk.ninjokin.tweet;

import org.bukkit.configuration.Configuration;
import org.bukkit.plugin.java.JavaPlugin;

import tk.ninjokin.tweet.util.Util;

public class Tweet extends JavaPlugin {
	
	public void onEnable() {
		confg = getConfig();
		saveConfig();
		
		u.Log("Successfully loaded into memory!");
	}
	
	public void onDisable() {
		u.Log("Safely unloaded from memory!");
	}
	
	// Start methods
	
	public String getString(String path) {
		return confg.getString(path);
	}
	
	private Configuration confg;
	private Util u = new Util();
}