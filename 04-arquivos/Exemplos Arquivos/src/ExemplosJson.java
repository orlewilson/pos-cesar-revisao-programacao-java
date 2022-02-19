import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
 * Revis�o de Programa��o
 * Orlewilson Maia
 * 19/02/2022
 * Exemplos Manipula��o de Arquivos JSON em Java
 * 
 * */
public class ExemplosJson {

	public static void main(String[] args) {

//		{
//			"curso": "Especializa��o em Testes �geis",
//			"disciplinas" : [
//			{
//				"nome": "Revis�o de Programa��o",
//				"professor" : "Orlewilson Bentes Maia"
//			}
//			],
//			"alunos" : [
//			{
//				"nome": "Lucas",
//				"matricula" : 12345
//			},
//			{
//				"nome": "M�rcia",
//				"matricula" : 12344
//			},
//			{
//				"nome": "Mar�lia",
//				"matricula" : 12343
//			}
//			]
//		}	

		// cria��o
		JSONObject testeAgeis = new JSONObject();

		testeAgeis.put("curso", "Especializa��o em Testes �geis");

		JSONArray disciplinas = new JSONArray();
		JSONObject disciplina;

		disciplina = new JSONObject();
		disciplina.put("nome", "Revis�o de Programa��o");
		disciplina.put("professor", "Orlewilson Bentes Maia");
		disciplinas.add(disciplina);

		testeAgeis.put("disciplinas", disciplinas);

		JSONArray alunos = new JSONArray();

		JSONObject aluno = new JSONObject();

		aluno.put("nome", "Lucas");
		aluno.put("matricula", 12344);
		alunos.add(aluno);

		aluno = new JSONObject();
		aluno.put("nome", "M�rcia");
		aluno.put("matricula", 12345);
		alunos.add(aluno);

		aluno = new JSONObject();
		aluno.put("nome", "Mar�lia");
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
