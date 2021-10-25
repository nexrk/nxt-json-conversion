/*
 *
 * Author: Radhakrishnan
 *
 */
package com.nxt.app;

import java.io.IOException;
import java.util.List;

import com.nxt.json.Items;
import com.nxt.model.ItemOutput;
import com.nxt.process.ItemDataConversion;
import com.nxt.process.ItemDataReadProcess;
import com.nxt.process.ItemDataWriteProcess;

/**
 * The Class ItemMainApplication.
 */
public class ItemMainApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) {

		// read json file and convert into java
		Items items = ItemDataReadProcess.openAndReadFile("Sample.json");

		// format the data as required
		List<ItemOutput> convertedItems = ItemDataConversion.convertItemData(items);

		// write the data into file
		ItemDataWriteProcess.writeItemData(convertedItems);

	}
}
