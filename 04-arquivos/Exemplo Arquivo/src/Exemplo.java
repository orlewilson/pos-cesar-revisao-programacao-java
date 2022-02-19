import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo {

	public static void main(String[] args) {

		// escrita
		try {
			FileWriter writer = new FileWriter("MyFile.txt", true);
			writer.write("Hello World");
			writer.write("\r\n"); // write new line
			writer.write("Good Bye!");
			writer.write("\r\n"); // write new line
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// leitura
		try {
			FileReader reader = new FileReader("MyFile.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
