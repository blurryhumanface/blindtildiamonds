package me.Sentaan.BlindTilDiamonds.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.potion.PotionEffectType;

import me.Sentaan.BlindTilDiamonds.Main;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;

public class DiamondsListener implements Listener{
	private Main plugin;
	
	public DiamondsListener(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void Diamonds(PlayerAdvancementDoneEvent event) {
		Player p = event.getPlayer();
		
		p.removePotionEffect(PotionEffectType.BLINDNESS);
		
	}

}
