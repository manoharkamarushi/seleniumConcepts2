package poi;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintContent {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Mypoi_read.createwb();
		Mypoi_read.getData(sheetindex, row, col);

	}

}
