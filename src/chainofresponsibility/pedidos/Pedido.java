package chainofresponsibility.pedidos;

public class Pedido {

	private String itens;
	private int quantidade;

	public Pedido(String itens, int quantidade) {
		this.itens = itens;
		this.quantidade = quantidade;
	}

	public String getItens() {
		return itens;
	}

	public void setItens(String itens) {
		this.itens = itens;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
