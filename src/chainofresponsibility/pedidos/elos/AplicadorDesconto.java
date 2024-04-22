package chainofresponsibility.pedidos.elos;

import chainofresponsibility.pedidos.Pedido;

public class AplicadorDesconto implements ProcessadorPedido {

	private ProcessadorPedido proximoProcessador;

	@Override
	public void processarPedido(Pedido pedido) {
		System.out.println("Aplicando descontos...");
		// Implementação da lógica de aplicação de descontos
		if (proximoProcessador != null) {
			proximoProcessador.processarPedido(pedido);
		}

	}

	@Override
	public void setProximoProcessador(ProcessadorPedido proximoProcessador) {
		this.proximoProcessador = proximoProcessador;

	}

}
