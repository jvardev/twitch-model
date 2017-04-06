package dev.jvar.twitch.model.users;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by jvar on 31/03/2017.
 */
public class Notifications {

    @SerializedName("email")
    @Expose
    private Boolean email;
    @SerializedName("push")
    @Expose
    private Boolean push;

    /**
     * No args constructor for use in serialization
     *
     */
    public Notifications() {
    }

    /**
     *
     * @param email
     * @param push
     */
    public Notifications(Boolean email, Boolean push) {
        super();
        this.email = email;
        this.push = push;
    }

    public Boolean getEmail() {
        return email;
    }

    public void setEmail(Boolean email) {
        this.email = email;
    }

    public Boolean getPush() {
        return push;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

