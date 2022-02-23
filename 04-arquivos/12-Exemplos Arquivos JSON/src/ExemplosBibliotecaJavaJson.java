import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * Revisão de Programação
 * Orlewilson Maia
 * 19/02/2022
 * Exemplos Manipulação de Arquivos JSON em Java
 * 
 * */
public class ExemplosBibliotecaJavaJson {

	public static void main(String[] args) {

//		{
//			"curso": "Especialização em Testes Ágeis",
//			"disciplinas" : [
//			{
//				"nome": "Revisão de Programação",
//				"professor" : "Orlewilson Bentes Maia"
//			}
//			],
//			"alunos" : [
//			{
//				"nome": "Lucas",
//				"matricula" : 12345
//			},
//			{
//				"nome": "Márcia",
//				"matricula" : 12344
//			},
//			{
//				"nome": "Marília",
//				"matricula" : 12343
//			}
//			]
//		}	

		try {
			// criação
			JSONObject testeAgeis = new JSONObject();

			testeAgeis.put("curso", "Especialização em Testes Ágeis");

			JSONArray disciplinas = new JSONArray();
			JSONObject disciplina;

			disciplina = new JSONObject();
			disciplina.put("nome", "Revisão de Programação");
			disciplina.put("professor", "Orlewilson Bentes Maia");
			disciplinas.put(disciplina);

			testeAgeis.put("disciplinas", disciplinas);

			JSONArray alunos = new JSONArray();

			JSONObject aluno = new JSONObject();

			aluno.put("nome", "Lucas");
			aluno.put("matricula", 12344);
			alunos.put(aluno);

			aluno = new JSONObject();
			aluno.put("nome", "Márcia");
			aluno.put("matricula", 12345);
			alunos.put(aluno);

			aluno = new JSONObject();
			aluno.put("nome", "Marília");
			aluno.put("matricula", 12346);
			alunos.put(aluno);

			testeAgeis.put("alunos", alunos);

			FileWriter arquivoJson = new FileWriter("exemplo-java-json.json", false);

			arquivoJson.write(testeAgeis.toString(4));

			arquivoJson.close();
			System.out.println(testeAgeis.toString(4));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// leitura
		JSONParser parserTestesAgeis = new JSONParser();

		try {
			String arquivoTestesAgeis = new String(Files.readAllBytes(Paths.get("exemplo-java-json.json")));

			JSONObject json = new JSONObject(arquivoTestesAgeis);

			JSONObject raizTestesAgeis = new JSONObject(arquivoTestesAgeis);

			String curso = (String) raizTestesAgeis.get("curso");
			System.out.println("Curso: " + curso);

			JSONArray disciplinasLidas = (JSONArray) raizTestesAgeis.get("disciplinas");

			for (int i = 0; i < disciplinasLidas.length(); i++) {
				JSONObject disciplinaLida = (JSONObject) disciplinasLidas.get(i);
				String nomeDisciplina = (String) disciplinaLida.get("nome");
				String professorDisciplina = (String) disciplinaLida.get("professor");

				System.out.println("Nome Disciplina: " + nomeDisciplina);
				System.out.println("Nome Professor: " + professorDisciplina);
			}

			JSONArray alunosLidos = (JSONArray) raizTestesAgeis.get("alunos");
			for (int i = 0; i < alunosLidos.length(); i++) {
				JSONObject alunoLido = (JSONObject) alunosLidos.get(i);
				String nomeAluno = (String) alunoLido.get("nome");
				int matriculaAluno = (int) alunoLido.get("matricula");

				System.out.println("Nome Aluno: " + nomeAluno);
				System.out.println("Matrícula Aluno: " + matriculaAluno);
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
