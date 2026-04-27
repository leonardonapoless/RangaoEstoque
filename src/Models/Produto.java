package Models;

public class Produto {
	private int idProduto;
	private String nomeProduto;
	private int idFornecedor;
	private int quantAtual;
	private float vlrTotal;
	private int idCat;
	
	public Produto(int idProduto, String nomeProduto, int idFornecedor, int quantAtual, float vlrTotal, int idCat){
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.idFornecedor = idFornecedor;
		this.quantAtual = quantAtual;
		this.vlrTotal = vlrTotal;
		this.idCat = idCat;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public int getQuantAtual() {
		return quantAtual;
	}

	public float getVlrTotal() {
		return vlrTotal;
	}

	public int getIdCat() {
		return idCat;
	}
}