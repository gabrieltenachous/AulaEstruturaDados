package SelectionSort;
import java.text.DecimalFormat;

public class Produtos { 
	private static int codigo = 1;

	private Integer id;
	private Double preco;

	public Produtos(double preco) {
		this.id = codigo++;
		setPreco(preco);
	}

	public int getId() {
		return id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() { 
		DecimalFormat df = new DecimalFormat(",##0.00");	
		return "Produtos [id=" + id + ", preco= R$ " + df.format(preco) + "]";
	}
	 
}
