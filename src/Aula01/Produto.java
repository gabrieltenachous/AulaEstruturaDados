package Aula01;

public class Produto {
	private String local;
	public String getLocal() {
		return local;
	}
	public double getPreco() {
		return preco;
	}

	private double preco;
	
	public Produto(String local,Double preco) {
		setLocal(local);
		setPreco(preco);
	}
	public void setLocal(String local) {
		if(!local.isEmpty()) {
			this.local = local;
		}
	}
	
	public void setPreco(double preco) {
		if(preco >=0.0) {
			this.preco = preco;
			
		}
	}
	public String toString() {
		return "[Local: "+local+",Preco:"+preco+"]";
	}
}
