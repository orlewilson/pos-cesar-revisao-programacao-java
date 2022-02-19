import java.io.FileWriter;

import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Revisão de Programação
 * Orlewilson Maia
 * 19/02/2022
 * Exemplos Manipulação de Arquivos JSON em Java
 * 
 * */
public class ExemplosJson2 {

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

			FileWriter arquivoJson = new FileWriter("exemplo2.json", false);

			arquivoJson.write(testeAgeis.toString(4));

			arquivoJson.close();
			System.out.println(testeAgeis.toString(4));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

//		System.out.println(testeAgeis.toString());
//		String prettyJson = testeAgeis.toString(4);

		// leitura

	}
}
