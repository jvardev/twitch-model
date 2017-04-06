package dev.jvar.twitch.model.channels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by jvar on 30/03/2017.
 */

public class UpdateChannelResponse {

    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("broadcaster_language")
    @Expose
    private String broadcasterLanguage;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("followers")
    @Expose
    private Integer followers;
    @SerializedName("game")
    @Expose
    private String game;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("mature")
    @Expose
    private Boolean mature;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("partner")
    @Expose
    private Boolean partner;
    @SerializedName("profile_banner")
    @Expose
    private Object profileBanner;
    @SerializedName("profile_banner_background_color")
    @Expose
    private Object profileBannerBackgroundColor;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("video_banner")
    @Expose
    private Object videoBanner;
    @SerializedName("views")
    @Expose
    private Integer views;

    /**
     * No args constructor for use in serialization
     *
     */
    public UpdateChannelResponse() {
    }

    /**
     *
     * @param logo
     * @param status
     * @param profileBanner
     * @param game
     * @param url
     * @param videoBanner
     * @param updatedAt
     * @param id
     * @param followers
     * @param views
     * @param createdAt
     * @param mature
     * @param name
     * @param partner
     * @param language
     * @param displayName
     * @param broadcasterLanguage
     * @param profileBannerBackgroundColor
     */
    public UpdateChannelResponse(Integer id, String broadcasterLanguage, String createdAt, String displayName, Integer followers, String game, String language, String logo, Boolean mature, String name, Boolean partner, Object profileBanner, Object profileBannerBackgroundColor, String status, String updatedAt, String url, Object videoBanner, Integer views) {
        super();
        this.id = id;
        this.broadcasterLanguage = broadcasterLanguage;
        this.createdAt = createdAt;
        this.displayName = displayName;
        this.followers = followers;
        this.game = game;
        this.language = language;
        this.logo = logo;
        this.mature = mature;
        this.name = name;
        this.partner = partner;
        this.profileBanner = profileBanner;
        this.profileBannerBackgroundColor = profileBannerBackgroundColor;
        this.status = status;
        this.updatedAt = updatedAt;
        this.url = url;
        this.videoBanner = videoBanner;
        this.views = views;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBroadcasterLanguage() {
        return broadcasterLanguage;
    }

    public void setBroadcasterLanguage(String broadcasterLanguage) {
        this.broadcasterLanguage = broadcasterLanguage;
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

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getMature() {
        return mature;
    }

    public void setMature(Boolean mature) {
        this.mature = mature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPartner() {
        return partner;
    }

    public void setPartner(Boolean partner) {
        this.partner = partner;
    }

    public Object getProfileBanner() {
        return profileBanner;
    }

    public void setProfileBanner(Object profileBanner) {
        this.profileBanner = profileBanner;
    }

    public Object getProfileBannerBackgroundColor() {
        return profileBannerBackgroundColor;
    }

    public void setProfileBannerBackgroundColor(Object profileBannerBackgroundColor) {
        this.profileBannerBackgroundColor = profileBannerBackgroundColor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getVideoBanner() {
        return videoBanner;
    }

    public void setVideoBanner(Object videoBanner) {
        this.videoBanner = videoBanner;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}