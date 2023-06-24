package sistema_padaria;

public class ItemFatura {
	private Produto produto;
	private int quantidade;

	public ItemFatura(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getCodigo() {
		return produto.getCodigo();
	}

}
