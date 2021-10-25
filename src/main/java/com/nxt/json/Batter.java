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
 * The Class Batter.
 */
@Generated("jsonschema2pojo")
public class Batter {

	/** The id. */
	@SerializedName("id")
	@Expose
	private String id;

	/** The type. */
	@SerializedName("type")
	@Expose
	private String type;

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

}
