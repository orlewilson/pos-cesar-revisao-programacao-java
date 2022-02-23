/*
 * Revisão de Programação
 * Orlewilson Maia
 * 19/02/2022
 * Exemplos Manipulação de Arquivos TXT em Java
 * 
 * */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Exemplos {

	public static void main(String[] args) {

		// escrita
		try {
			// cria o objeto para manipular aqruivo
			// true - adiciona no fim
			// false - sobreescreve o arquivo
			FileWriter arquivo = new FileWriter("nomes.txt", true);

			// escreve no arquivo
			arquivo.write("Orlewilson");
			arquivo.append("\r\n"); // escrever uma nova linha
			arquivo.write("Indy");
			arquivo.write("\r\n"); // escrever uma nova linha
			arquivo.write("Yago");
			arquivo.write("\r\n"); // escrever uma nova linha
			arquivo.write("Virgínia");
			arquivo.write("\r\n"); // escrever uma nova linha
			arquivo.write("Diego");
			arquivo.write("\r\n"); // escrever uma nova linha
			arquivo.write("" + 10);
			arquivo.write("\r\n"); // escrever uma nova linha

			// fechar o arquivo
			arquivo.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// leitura
		try {
			FileReader arquivo2 = new FileReader("nomes.txt");

			BufferedReader buffer = new BufferedReader(arquivo2);

			String linhaLida;
			while ((linhaLida = buffer.readLine()) != null) {
				System.out.println(linhaLida);
			}

			arquivo2.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
