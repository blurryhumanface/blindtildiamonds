package me.Sentaan.BlindTilDiamonds;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("(!) Blind 'Til Diamonds Online");
	}
	public void onDisable() {
		System.out.println("(!) Blind 'Til Diamonds Offline");
	}

}
