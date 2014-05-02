
public class ItemDeCompra {

	private String descricao; 
	private Float preco;
	private int quantidade;
	
	public ItemDeCompra(String descricao, Float preco, int quantidade){
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String toString() {
		return "ItemDeCompra [descricao=" + descricao + ", preco=" + preco
				+ ", quantidade=" + quantidade + "]";
	}
	
}
