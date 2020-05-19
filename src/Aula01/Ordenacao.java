package Aula01;

public class Ordenacao {

	public static void main(String[] args) {

		Produto[] produtos = new Produto[5];
		produtos[0] = new Produto("Bolao da informatica",14000.00);
		produtos[1] = new Produto("AliEspresso",5400.00);
		produtos[2] = new Produto("Pixau",7932.00);
		produtos[3] = new Produto("Atacado Livre",8100.00);
		produtos[4] = new Produto("Zé da Esquina",5600.00);
		 
		imprime(produtos);
		
		int menor = buscaMenor(produtos,0,5);
		int maior = buscaMaior(produtos,0,5);
		System.out.println("Mais Barato: "+produtos[menor]);
		
		System.out.println("Mais Caro..:"+produtos[maior]);
		System.out.println("---------");
		 
		ordenada(produtos,0,produtos.length);
		imprime(produtos);
	}
	public static void ordenada(Produto[] produtos,int inicial,int terminal) {
		for(int atual=inicial;atual<terminal;atual++) {
			int menor=buscaMenor(produtos,atual,produtos.length);
			System.out.println(">>>>Trocando a posicao "+atual+" pela"+ menor+"<<<<<<");
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			System.out.println(">>>>Trocando a posicao "+produtoAtual+" pela"+ produtoMenor+"<<<<<<");
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
			
		}	
	}
	public static int buscaMaior(Produto[] produtos,int inicio,int termino){

		int  maisCaro = inicio;
		
		for(int atual=inicio;atual<termino;atual++) {
			if(produtos[atual].getPreco() > produtos[maisCaro].getPreco()) {
				maisCaro=atual;
			}
		}
		 return maisCaro;
	}
	
	public static int buscaMenor(Produto[] produtos,int inicio,int termino){

		int maisBarato = inicio;
		for(int atual=inicio;atual<termino;atual++) {
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato=atual;
			}
		}
		
		return maisBarato;
	}
    public static void imprime(Produto[] produtos) {
		for (Produto p:produtos) {
			System.out.print(p);
		}
		System.out.println();
	}

}
