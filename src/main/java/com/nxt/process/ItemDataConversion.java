/*
 *
 * Author: Radhakrishnan
 *
 */
package com.nxt.process;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.nxt.json.Item;
import com.nxt.json.Items;
import com.nxt.model.ItemOutput;

/**
 * The Class ItemDataConversion.
 */
public class ItemDataConversion {

	/**
	 * Convert item data.
	 *
	 * @param items the items
	 * @return the list
	 */
	public static List<ItemOutput> convertItemData(Items items) {

		if (Objects.nonNull(items)) {
			List<Item> sortedItems = items.getItems().getItem().stream().sorted(Comparator.comparing(Item::getId))
					.collect(Collectors.toList());

			List<ItemOutput> itemOutputs = sortedItems.stream().map(item -> getItemOutput(item))
					.collect(Collectors.toList()).stream().flatMap(batter -> batter.stream())
					.collect(Collectors.toList());

			return itemOutputs;
		} else {
			return null;
		}

	}

	/**
	 * Gets the item output.
	 *
	 * @param item the item
	 * @return the item output
	 */
	private static List<ItemOutput> getItemOutput(Item item) {
		if (Objects.nonNull(item.getBatters())) {
			return item.getBatters().getBatter().stream().map(batter -> getTopper(batter.getType(), item))
					.collect(Collectors.toList()).stream().flatMap(batter -> batter.stream())
					.collect(Collectors.toList());
		} else {
			return new ArrayList<ItemOutput>();
		}

	}

	/**
	 * Gets the batter.
	 *
	 * @param batter the batter
	 * @param item the item
	 * @return the batter
	 */
	private static List<ItemOutput> getTopper(String batter, Item item) {

		if (null != item.getTopping()) {
			return item.getTopping().stream().map(topping -> getToppings(item, batter, topping.getType()))
					.collect(Collectors.toList());

		} else {
			return new ArrayList<ItemOutput>();
		}
	}

	/**
	 * Gets the toppings.
	 *
	 * @param item the item
	 * @param batter the batter
	 * @param topping the topping
	 * @return the toppings
	 */
	private static ItemOutput getToppings(Item item, String batter, String topping) {

		ItemOutput itemOutput = new ItemOutput();
		itemOutput.setBatter(batter);
		itemOutput.setId(item.getId());
		itemOutput.setName(item.getName());
		itemOutput.setTopping(topping);
		itemOutput.setType(item.getType());

		return itemOutput;
	}

}
