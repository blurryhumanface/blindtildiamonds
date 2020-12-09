package me.Sentaan.BlindTilDiamonds;

import org.bukkit.plugin.java.JavaPlugin;

import me.Sentaan.BlindTilDiamonds.Commands.BlindingCommand;
import me.Sentaan.BlindTilDiamonds.Listeners.DiamondsListener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("(!) Blind 'Til Diamonds Online");
		new BlindingCommand(this);
		new DiamondsListener(this);
	}
	public void onDisable() {
		System.out.println("(!) Blind 'Til Diamonds Offline");
	}

}
