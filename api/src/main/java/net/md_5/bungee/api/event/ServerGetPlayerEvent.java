package net.md_5.bungee.api.event;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.md_5.bungee.api.plugin.Event;

/**
 * @author 小坤
 * @since 2024/12/19 07:05
 */
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
public class ServerGetPlayerEvent extends Event
{

    private String playerName;

    public ServerGetPlayerEvent(String playerName)
    {
        this.playerName = playerName;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
}
