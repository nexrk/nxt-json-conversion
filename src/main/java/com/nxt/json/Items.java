/*
 *
 * Author: Radhakrishnan
 *
 */

package com.nxt.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class Items.
 */
@Generated("jsonschema2pojo")
public class Items {

    /** The items. */
    @SerializedName("items")
    @Expose
    private ItemList items;

    /**
     * Gets the items.
     *
     * @return the items
     */
    public ItemList getItems() {
        return items;
    }

    /**
     * Sets the items.
     *
     * @param items the new items
     */
    public void setItems(ItemList items) {
        this.items = items;
    }

}
