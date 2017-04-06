package dev.jvar.twitch.model.channels;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by jvar on 30/03/2017.
 */

public class UpdateChannel {

    @SerializedName("channel")
    @Expose
    private Channel channel;

    /**
     * No args constructor for use in serialization
     *
     */
    public UpdateChannel() {
    }

    /**
     *
     * @param channel
     */
    public UpdateChannel(Channel channel) {
        super();
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
