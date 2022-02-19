import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * Revisão de Programação
 * Orlewilson Maia
 * 19/02/2022
 * Exemplos Manipulação de Arquivos JSON em Java
 * 
 * */
public class ExemplosJson {

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

		// criação
		JSONObject testesAgeis = new JSONObject();

//		"curso": "Especialização em Testes Ágeis",
		testesAgeis.put("curso", "Especialização em Testes Ágeis");

//		"disciplinas" : [
		JSONArray disciplinas = new JSONArray();
		JSONObject disciplina;

		disciplina = new JSONObject();
//		{
//		"nome": "Revisão de Programação",
//		"professor" : "Orlewilson Bentes Maia"
//	}
		disciplina.put("nome", "Revisão de Programação");
		disciplina.put("professor", "Orlewilson Bentes Maia");
		disciplinas.add(disciplina);

		testesAgeis.put("disciplinas", disciplinas);

//		"alunos" : [
		JSONArray alunos = new JSONArray();

		JSONObject aluno;

		aluno = new JSONObject();
//		{
//		"nome": "Lucas",
//		"matricula" : 12345
//	},
		aluno.put("nome", "Lucas");
		aluno.put("matricula", 12344);
		alunos.add(aluno);

//		{
//		"nome": "Márcia",
//		"matricula" : 12344
//	},
		aluno = new JSONObject();
		aluno.put("nome", "Márcia");
		aluno.put("matricula", 12345);
		alunos.add(aluno);

//		{
//		"nome": "Marília",
//		"matricula" : 12343
//	}
		aluno = new JSONObject();
		aluno.put("nome", "Marília");
		aluno.put("matricula", 12346);
		alunos.add(aluno);

		testesAgeis.put("alunos", alunos);

		try {
			FileWriter arquivoJson = new FileWriter("exemplo.json", false);

			arquivoJson.write(testesAgeis.toJSONString());

			arquivoJson.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println(testesAgeis.toString());

		// leitura
//		{
//		"curso": "Especialização em Testes Ágeis",
//		"disciplinas" : [
//		{
//			"nome": "Revisão de Programação",
//			"professor" : "Orlewilson Bentes Maia"
//		}
//		],
//		"alunos" : [
//		{
//			"nome": "Lucas",
//			"matricula" : 12345
//		},
//		{
//			"nome": "Márcia",
//			"matricula" : 12344
//		},
//		{
//			"nome": "Marília",
//			"matricula" : 12343
//		}
//		]
//	}	

		JSONParser parserTestesAgeis = new JSONParser();

		try {
			FileReader arquivoTestesAgeis = new FileReader("exemplo.json");

			JSONObject raizTestesAgeis = (JSONObject) parserTestesAgeis.parse(arquivoTestesAgeis);

			String curso = (String) raizTestesAgeis.get("curso");
			System.out.println("Curso: " + curso);

			JSONArray disciplinasLidas = (JSONArray) raizTestesAgeis.get("disciplinas");

			for (int i = 0; i < disciplinasLidas.size(); i++) {
				JSONObject disciplinaLida = (JSONObject) disciplinasLidas.get(i);
				String nomeDisciplina = (String) disciplinaLida.get("nome");
				String professorDisciplina = (String) disciplinaLida.get("professor");

				System.out.println("Nome Disciplina: " + nomeDisciplina);
				System.out.println("Nome Professor: " + professorDisciplina);
			}

			JSONArray alunosLidos = (JSONArray) raizTestesAgeis.get("alunos");
			for (int i = 0; i < alunosLidos.size(); i++) {
				JSONObject alunoLido = (JSONObject) alunosLidos.get(i);
				String nomeAluno = (String) alunoLido.get("nome");
				int matriculaAluno = ((Long) alunoLido.get("matricula")).intValue();

				System.out.println("Nome Aluno: " + nomeAluno);
				System.out.println("Matrícula Aluno: " + matriculaAluno);
			}

			arquivoTestesAgeis.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
