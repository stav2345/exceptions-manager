package log;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		File logDirectory = new File("logs");
		ConsolePrinter printer = ConsolePrinter.getInstance();
		printer.start(System.nanoTime(), logDirectory);
		
		System.out.println("Test: System.out flow into the log file");
		System.err.println("Test: System.err flow into the log file");
		
		try {
			throw new Exception("Test: exception into log file");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
