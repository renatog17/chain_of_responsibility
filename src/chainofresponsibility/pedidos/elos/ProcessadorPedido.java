package chainofresponsibility.pedidos.elos;

import chainofresponsibility.pedidos.Pedido;

public interface ProcessadorPedido {
	void processarPedido(Pedido pedido);
	void setProximoProcessador(ProcessadorPedido processadorPedido);
}
