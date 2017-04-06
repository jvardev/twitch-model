package dev.jvar.twitch.model.games;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by jvar on 31/03/2017.
 */

public class Top {

    @SerializedName("channels")
    @Expose
    private Integer channels;
    @SerializedName("viewers")
    @Expose
    private Integer viewers;
    @SerializedName("game")
    @Expose
    private Game game;

    /**
     * No args constructor for use in serialization
     *
     */
    public Top() {
    }

    /**
     *
     * @param viewers
     * @param channels
     * @param game
     */
    public Top(Integer channels, Integer viewers, Game game) {
        super();
        this.channels = channels;
        this.viewers = viewers;
        this.game = game;
    }

    public Integer getChannels() {
        return channels;
    }

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    public Integer getViewers() {
        return viewers;
    }

    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
