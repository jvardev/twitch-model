package dev.jvar.twitch.model.games;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Created by jvar on 31/03/2017.
 */

public class GetTopGamesResponse {

    @SerializedName("_total")
    @Expose
    private Integer total;
    @SerializedName("top")
    @Expose
    private List<Top> top = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public GetTopGamesResponse() {
    }

    /**
     *
     * @param total
     * @param top
     */
    public GetTopGamesResponse(Integer total, List<Top> top) {
        super();
        this.total = total;
        this.top = top;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Top> getTop() {
        return top;
    }

    public void setTop(List<Top> top) {
        this.top = top;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
