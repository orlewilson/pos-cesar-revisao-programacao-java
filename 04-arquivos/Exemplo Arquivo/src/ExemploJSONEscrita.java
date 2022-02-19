import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ExemploJSONEscrita {
	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("nome", "Orlewilson Maia");
		obj.put("idade", 37);

		JSONArray list = new JSONArray();
		list.add("Olá!");
		list.add("Sou o prof. Orlewilson Maia");

		obj.put("mensagens", list);

		try (FileWriter file = new FileWriter("exemplo-1.json")) {
			file.write(obj.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj);

	}
}
