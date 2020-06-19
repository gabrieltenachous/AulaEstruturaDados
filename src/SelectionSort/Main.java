package SelectionSort;
import java.util.Random;
 

public class Main {
	public static void main(String[] args) {
		Random gerador = new Random();
		Produtos[] prods = new Produtos[10000];
		for (int i = 0; i < 10000; i++) {
			prods[i] = new Produtos(gerador.nextDouble() * 90000);
		} 
		//Ordenação do menor para o maior preço
		selectionSort(prods, 0, prods.length); 
		imprime(prods);
		
		//Menor valor dos Produtos 
		System.out.println("Menor Valor: "+prods[buscaMenor(prods, 0, prods.length)]);
	}

	public static int buscaMenor(Produtos[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
		for (int atual = inicio; atual < termino; atual++) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}

	public static void selectionSort(Produtos[] produtos, int inicio, int termino) {
		for (int atual = inicio; atual < termino - 1; atual++) {
			int menor = buscaMenor(produtos, atual, termino);

			Produtos produtoAtual = produtos[atual];
			Produtos produtoMenor = produtos[menor];
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;

		}
	}

	static void imprime(Produtos[] produtos) {
		for (Produtos p : produtos) {
			System.out.println(p);
		}
		System.out.println();
	}
}
