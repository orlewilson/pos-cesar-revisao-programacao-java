import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ExemploJSONLeitura {
	public static void main(String[] args) {

		JSONParser parser = new JSONParser();

		try (Reader reader = new FileReader("exemplo.json")) {

			JSONObject jsonObject = (JSONObject) parser.parse(reader);
			System.out.println(jsonObject);

			String curso = (String) jsonObject.get("curso");
			System.out.println(curso);

			// loop array
			JSONArray disciplinas = (JSONArray) jsonObject.get("disciplinas");
			for (int i = 0; i < disciplinas.size(); i++) {
				JSONObject disciplina = (JSONObject) disciplinas.get(i);
				String nomeDisciplina = (String) disciplina.get("nome");
				String nomeProfessor = (String) disciplina.get("professor");
				System.out.println(nomeDisciplina);
				System.out.println(nomeProfessor);

			}

			JSONArray alunos = (JSONArray) jsonObject.get("alunos");
			for (int j = 0; j < alunos.size(); j++) {
				JSONObject aluno = (JSONObject) alunos.get(j);
				String nomeAluno = (String) aluno.get("nome");
				int matriculaAluno = ((Long) aluno.get("matricula")).intValue();
				System.out.println(nomeAluno);
				System.out.println(matriculaAluno);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
	}
}
