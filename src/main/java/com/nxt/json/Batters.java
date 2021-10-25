/*
 *
 * Author: Radhakrishnan
 *
 */

package com.nxt.json;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class Batters.
 */
@Generated("jsonschema2pojo")
public class Batters {

    /** The batter. */
    @SerializedName("batter")
    @Expose
    private List<Batter> batter = null;

    /**
     * Gets the batter.
     *
     * @return the batter
     */
    public List<Batter> getBatter() {
        return batter;
    }

    /**
     * Sets the batter.
     *
     * @param batter the new batter
     */
    public void setBatter(List<Batter> batter) {
        this.batter = batter;
    }

}
