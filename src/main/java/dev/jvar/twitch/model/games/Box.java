package dev.jvar.twitch.model.games;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by jvar on 31/03/2017.
 */

public class Box {

    @SerializedName("large")
    @Expose
    private String large;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("template")
    @Expose
    private String template;

    /**
     * No args constructor for use in serialization
     *
     */
    public Box() {
    }

    /**
     *
     * @param template
     * @param small
     * @param medium
     * @param large
     */
    public Box(String large, String medium, String small, String template) {
        super();
        this.large = large;
        this.medium = medium;
        this.small = small;
        this.template = template;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
