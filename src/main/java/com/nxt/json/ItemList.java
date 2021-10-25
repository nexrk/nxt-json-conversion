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
 * The Class ItemList.
 */
@Generated("jsonschema2pojo")
public class ItemList {

    /** The item. */
    @SerializedName("item")
    @Expose
    private List<Item> item = null;

    /**
     * Gets the item.
     *
     * @return the item
     */
    public List<Item> getItem() {
        return item;
    }

    /**
     * Sets the item.
     *
     * @param item the new item
     */
    public void setItem(List<Item> item) {
        this.item = item;
    }

}
