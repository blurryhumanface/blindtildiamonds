package me.Sentaan.BlindTilDiamonds.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.Sentaan.BlindTilDiamonds.Main;

public class BlindingCommand implements CommandExecutor{
	private Main plugin;
	
	public BlindingCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("blind").setExecutor(this);
	}
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		
		if (sender instanceof Player) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1000000, 255));
		}
		else {
			sender.sendMessage("Why are you trying to do this? Don't do this");
		}
		return false;
	}

}
