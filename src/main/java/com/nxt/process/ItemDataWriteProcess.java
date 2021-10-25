/*
 *
 * Author: Radhakrishnan
 *
 */
package com.nxt.process;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import com.nxt.model.ItemOutput;

/**
 * The Class ItemDataWriteProcess.
 */
public class ItemDataWriteProcess {

	/** The Constant SAMPLE_CSV_FILE. */
	private static final String SAMPLE_CSV_FILE = "./result/sample.csv";

	/**
	 * Write item data.
	 *
	 * @param items the items
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void writeItemData(List<ItemOutput> items) {

		if (null != items) {

			try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

					CSVPrinter csvPrinter = new CSVPrinter(writer,
							CSVFormat.DEFAULT.withHeader("Id", "Type", "Name", "Batter", "Topping"));) {

				for (ItemOutput outputItem : items) {
					csvPrinter.printRecord(outputItem.getId(), outputItem.getType(), outputItem.getName(),
							outputItem.getBatter(), outputItem.getTopping());
				}

				csvPrinter.flush();
			} catch (IOException e) {
				System.out.println("There is problem while writing the file.");
			}
		}
	}
}
