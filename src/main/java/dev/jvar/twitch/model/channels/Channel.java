package dev.jvar.twitch.model.channels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by jvar on 30/03/2017.
 */
public class Channel {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("game")
    @Expose
    private String game;
    @SerializedName("delay")
    @Expose
    private String delay;
    @SerializedName("channel_feed_enabled")
    @Expose
    private Boolean channelFeedEnabled;

    /**
     * No args constructor for use in serialization
     *
     */
    public Channel() {
    }

    /**
     *
     * @param channelFeedEnabled
     * @param status
     * @param delay
     * @param game
     */
    public Channel(String status, String game, String delay, Boolean channelFeedEnabled) {
        super();
        this.status = status;
        this.game = game;
        this.delay = delay;
        this.channelFeedEnabled = channelFeedEnabled;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public Boolean getChannelFeedEnabled() {
        return channelFeedEnabled;
    }

    public void setChannelFeedEnabled(Boolean channelFeedEnabled) {
        this.channelFeedEnabled = channelFeedEnabled;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}