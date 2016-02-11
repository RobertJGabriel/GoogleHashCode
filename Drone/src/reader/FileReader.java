package reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

	private final String inputFile;

	private int row;

	private int columns;

	public FileReader(String inputFile) {

		this.inputFile = inputFile;

	}

	public void parseFile() throws IOException {
		Path path = Paths.get(inputFile);

		try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {

			String current_line = bufferedReader.readLine();
			
			String[] splited_string = current_line.split(" ");

			row = Integer.parseInt(splited_string[0]);
			columns = Integer.parseInt(splited_string[1]);
			
			
			System.out.println(Integer.parseInt(splited_string[1]));
			for (int i = 0; i < row; i++) {
				current_line = bufferedReader.readLine();
				current_line.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
			}
		}
	}
}
