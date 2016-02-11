package reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Map;

public class FileReader {

	private final String inputFile;

	private ArrayList<String> gameboard = new ArrayList<String>();

	private ArrayList<String> productTypes = new ArrayList<String>();

	/*
	 * Gameboard infotmation
	 * 
	 */
	private int indexForNumberOfDrone = 2; // number 3
	private int indexForTurn = 3;
	private int maxWeight = 4;
	private int numberOfProductTypes = 0;
	private int numberOfWareHouses = 0;

	/*
	 * Models
	 * 
	 */
	Map Map;

	public FileReader(String inputFile) {

		this.inputFile = inputFile;

	}

	public void parseFile() throws IOException {
		Path path = Paths.get(inputFile);

		try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
			String current_line;

	
			if ((current_line = bufferedReader.readLine()) != null) {
				gameboard = new ArrayList<String>(Arrays.asList(current_line.split("\\s+")));
				System.out.println("Look here 0 " + current_line);
			}

			/*
			 * Number of product types line 2 in files
			 */
			current_line = bufferedReader.readLine();
			System.out.println("Look here 1 " + current_line);
			productTypes = new ArrayList<String>(Arrays.asList(current_line.split("\\s+")));

			/*
			 * Products Types and weight line 3 in files
			 */
			current_line = bufferedReader.readLine();
			System.out.println("Look here 2 " + current_line);
			productTypes = new ArrayList<String>(Arrays.asList(current_line.split("\\s+")));
			numberOfWareHouses = Integer.parseInt(bufferedReader.readLine());

			for (int FirstGroup = 1; FirstGroup <= numberOfWareHouses; FirstGroup++) {
				current_line = bufferedReader.readLine();
				ArrayList<String> temp = new ArrayList<String>(Arrays.asList(current_line.split("\\s+")));
				int row;
				int column;
				row = Integer.parseInt(temp.get(0));
				column = Integer.parseInt(temp.get(1));
				current_line = bufferedReader.readLine();
			
				// Number of items now
				ArrayList<String> weights = new ArrayList<String>(Arrays.asList(current_line.split("\\s+")));

				//gameboard.
			}

		}

	}
}
