package adapter.lesson;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String readFileName = "/Users/fukazawakeisuke/web-application/JavaDesignPattern/src/adapter/lesson/file.txt";
		String writeFileName = "/Users/fukazawakeisuke/web-application/JavaDesignPattern/src/adapter/lesson/newfile.txt";

		FileIO fInHeritance = new FilePropertiesInHeritance();
		try {
			fInHeritance.readFromFile(readFileName);
			fInHeritance.setValue("year", "2004");
			fInHeritance.setValue("month", "4");
			fInHeritance.setValue("day", "21");
			fInHeritance.writeToFile(writeFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileIO fTransfer = new FilePropertiesTransfer();
		try {
			fTransfer.readFromFile(readFileName);
			fTransfer.setValue("year", "2004");
			fTransfer.setValue("month", "4");
			fTransfer.setValue("day", "21");
			fTransfer.writeToFile(writeFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
