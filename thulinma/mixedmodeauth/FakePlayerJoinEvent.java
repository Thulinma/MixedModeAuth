package thulinma.mixedmodeauth;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class FakePlayerJoinEvent extends PlayerJoinEvent {
	public FakePlayerJoinEvent(Player who, String joinMessage) {
		super(who, joinMessage);
	}
}