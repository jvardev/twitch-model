package dev.jvar.twitch.model.games;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by jvar on 31/03/2017.
 */

public class Game {

    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("box")
    @Expose
    private Box box;
    @SerializedName("giantbomb_id")
    @Expose
    private Integer giantbombId;
    @SerializedName("logo")
    @Expose
    private Logo logo;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;

    /**
     * No args constructor for use in serialization
     *
     */
    public Game() {
    }

    /**
     *
     * @param id
     * @param logo
     * @param giantbombId
     * @param name
     * @param box
     * @param popularity
     */
    public Game(Integer id, Box box, Integer giantbombId, Logo logo, String name, Integer popularity) {
        super();
        this.id = id;
        this.box = box;
        this.giantbombId = giantbombId;
        this.logo = logo;
        this.name = name;
        this.popularity = popularity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Integer getGiantbombId() {
        return giantbombId;
    }

    public void setGiantbombId(Integer giantbombId) {
        this.giantbombId = giantbombId;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
