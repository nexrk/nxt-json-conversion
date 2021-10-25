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
 * The Class Item.
 */
@Generated("jsonschema2pojo")
public class Item {

    /** The id. */
    @SerializedName("id")
    @Expose
    private String id;
    
    /** The type. */
    @SerializedName("type")
    @Expose
    private String type;
    
    /** The name. */
    @SerializedName("name")
    @Expose
    private String name;
    
    /** The ppu. */
    @SerializedName("ppu")
    @Expose
    private Double ppu;
    
    /** The batters. */
    @SerializedName("batters")
    @Expose
    private Batters batters;
    
    /** The topping. */
    @SerializedName("topping")
    @Expose
    private List<Topping> topping = null;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the ppu.
     *
     * @return the ppu
     */
    public Double getPpu() {
        return ppu;
    }

    /**
     * Sets the ppu.
     *
     * @param ppu the new ppu
     */
    public void setPpu(Double ppu) {
        this.ppu = ppu;
    }

    /**
     * Gets the batters.
     *
     * @return the batters
     */
    public Batters getBatters() {
        return batters;
    }

    /**
     * Sets the batters.
     *
     * @param batters the new batters
     */
    public void setBatters(Batters batters) {
        this.batters = batters;
    }

    /**
     * Gets the topping.
     *
     * @return the topping
     */
    public List<Topping> getTopping() {
        return topping;
    }

    /**
     * Sets the topping.
     *
     * @param topping the new topping
     */
    public void setTopping(List<Topping> topping) {
        this.topping = topping;
    }

}
