import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
		JSONObject testeAgeis = new JSONObject();

		testeAgeis.put("curso", "Especialização em Testes Ágeis");

		JSONArray disciplinas = new JSONArray();
		JSONObject disciplina;

		disciplina = new JSONObject();
		disciplina.put("nome", "Revisão de Programação");
		disciplina.put("professor", "Orlewilson Bentes Maia");
		disciplinas.add(disciplina);

		testeAgeis.put("disciplinas", disciplinas);

		JSONArray alunos = new JSONArray();

		JSONObject aluno = new JSONObject();

		aluno.put("nome", "Lucas");
		aluno.put("matricula", 12344);
		alunos.add(aluno);

		aluno = new JSONObject();
		aluno.put("nome", "Márcia");
		aluno.put("matricula", 12345);
		alunos.add(aluno);

		aluno = new JSONObject();
		aluno.put("nome", "Marília");
		aluno.put("matricula", 12346);
		alunos.add(aluno);

		testeAgeis.put("alunos", alunos);

		try {
			FileWriter arquivoJson = new FileWriter("exemplo.json", false);

			arquivoJson.write(testeAgeis.toJSONString());

			arquivoJson.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println(testeAgeis.toString());

		// leitura
		

	}
}
