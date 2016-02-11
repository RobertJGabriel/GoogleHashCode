
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import com.sun.istack.internal.FinalArrayList;
import reader.FileReader;

/**
 * Created by drop tables--; on 11/02/16.
 */

public class Main {

	public static final String BUSY_DAY = "busy_day.in";

	public static final String MOTHER_OF_ALL_WAREHOUSES = "mother_of_all_warehouses.in";

	public static final String RESUNDANCY = "redundancy.in";

	public static void main(String... args) throws IOException {
	
		FileReader fileUtils = new FileReader(BUSY_DAY);

		fileUtils.parseFile();
	}

}
