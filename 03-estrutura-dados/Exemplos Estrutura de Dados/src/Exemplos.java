import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Revisão de Programação
 * Orlewilson Maia
 * 19/02/2022
 * Exemplos de Estrutura de Dados (Lista, Fila e Pilha)
 * 
 * */

public class Exemplos {
	public static void main(String[] args) {

		// Exemplo de Lista
		System.out.println("\n Exemplo de Lista ----------");

		List<String> listaNomes = new ArrayList<String>();

		listaNomes.add("Rodrigo");
		listaNomes.add("Indy");
		listaNomes.add("Thiago");
		listaNomes.add("Pollyana");
		System.out.println(listaNomes);

		listaNomes.add(2, "Márcia");

		System.out.println(listaNomes);
		for (int i = 0; i < listaNomes.size(); i++) {
			System.out.println(listaNomes.get(i));
		}

		for (String nome : listaNomes) {
			System.out.println(nome);
		}

		listaNomes.remove("Thiago");
		listaNomes.remove(1);
		System.out.println(listaNomes);

		// Exemplo de Fila
		System.out.println("\n Exemplo de Fila----------");

//		Queue<Integer> filaNumeros = new LinkedList<Integer>();
		Deque<Integer> filaNumeros = new LinkedList<Integer>();

		System.out.println("Fila está vazia? " + filaNumeros.isEmpty());

		filaNumeros.add(50);
		filaNumeros.add(20);
		filaNumeros.add(10);
		filaNumeros.add(45);
		filaNumeros.add(5);
		System.out.println(filaNumeros);
		// peek - retorna primeiro elemento da fila
		System.out.println(filaNumeros.peek());

		filaNumeros.remove();

		System.out.println("Fila está vazia? " + filaNumeros.isEmpty());

		System.out.println(filaNumeros);

		System.out.println("Primeiro da Fila: " + filaNumeros.getFirst());
		System.out.println("Último da Fila: " + filaNumeros.getLast());

		// Exemplo de Pilha
		System.out.println("\n Exemplo de Pilha ----------");

//		Deque<String> pilhaNomes = new LinkedList<String>();
		Deque<String> pilhaNomes = new ArrayDeque<String>();

		pilhaNomes.push("Marília");
		pilhaNomes.push("Yago");
		pilhaNomes.push("Emanuel");
		pilhaNomes.push("Oscar");
		pilhaNomes.push("Talita");
		System.out.println(pilhaNomes);

		System.out.println("Topo a pilha? " + pilhaNomes.peek());
		System.out.println("Topo a pilha? " + pilhaNomes.getFirst());

		pilhaNomes.pop();

		System.out.println(pilhaNomes);

		System.out.println("Topo a pilha? " + pilhaNomes.peek());

	}
}
