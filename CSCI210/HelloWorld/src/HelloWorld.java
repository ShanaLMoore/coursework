import java.io.*; // for PrintWriter, IOException
import java.util.*; // for Scanner

public class HelloWorld {

	public static void main(String[] args) {		
        // open an output.txt file for output
        PrintWriter ot = new PrintWriter(new FileWriter("output.txt"));
		
        System.out.println("Starting shapes");
        ot.println("Starting shapes");
	}

}
