/*
 *
 * Author: Radhakrishnan
 *
 */
package com.nxt.process;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.nxt.json.Items;

/**
 * The Class ItemDataReadProcess.
 */
public class ItemDataReadProcess {

	/**
	 * Open and read file.
	 *
	 * @param filePath the file path
	 * @return the items
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static Items openAndReadFile(String filePath) {

		Gson gson = new Gson();

		Reader reader = null;
		try {
			reader = Files.newBufferedReader(Paths.get(filePath));
			Items items = gson.fromJson(reader, Items.class);
			return items;
		} catch (IOException e) {
			System.out.println("There is problem while reading the file.");
		}

		return null;

	}

}
