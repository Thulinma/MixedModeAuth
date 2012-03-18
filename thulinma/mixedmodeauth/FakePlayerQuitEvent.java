package thulinma.mixedmodeauth;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;

public class FakePlayerQuitEvent extends PlayerQuitEvent {
	public FakePlayerQuitEvent(Player who, String quitMessage) {
		super(who, quitMessage);
	}
}