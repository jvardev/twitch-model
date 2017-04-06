package dev.jvar.twitch.model.users;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by jvar on 31/03/2017.
 */


public class GetUserResponse {

    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("email_verified")
    @Expose
    private Boolean emailVerified;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("notifications")
    @Expose
    private Notifications notifications;
    @SerializedName("partnered")
    @Expose
    private Boolean partnered;
    @SerializedName("twitter_connected")
    @Expose
    private Boolean twitterConnected;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    /**
     * No args constructor for use in serialization
     *
     */
    public GetUserResponse() {
    }

    /**
     *
     * @param logo
     * @param type
     * @param emailVerified
     * @param updatedAt
     * @param id
     * @param bio
     * @param email
     * @param notifications
     * @param createdAt
     * @param name
     * @param twitterConnected
     * @param displayName
     * @param partnered
     */
    public GetUserResponse(Integer id, String bio, String createdAt, String displayName, String email, Boolean emailVerified, String logo, String name, Notifications notifications, Boolean partnered, Boolean twitterConnected, String type, String updatedAt) {
        super();
        this.id = id;
        this.bio = bio;
        this.createdAt = createdAt;
        this.displayName = displayName;
        this.email = email;
        this.emailVerified = emailVerified;
        this.logo = logo;
        this.name = name;
        this.notifications = notifications;
        this.partnered = partnered;
        this.twitterConnected = twitterConnected;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Notifications getNotifications() {
        return notifications;
    }

    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }

    public Boolean getPartnered() {
        return partnered;
    }

    public void setPartnered(Boolean partnered) {
        this.partnered = partnered;
    }

    public Boolean getTwitterConnected() {
        return twitterConnected;
    }

    public void setTwitterConnected(Boolean twitterConnected) {
        this.twitterConnected = twitterConnected;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}


