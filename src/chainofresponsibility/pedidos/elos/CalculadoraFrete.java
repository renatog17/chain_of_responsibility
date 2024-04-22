package chainofresponsibility.pedidos.elos;

import chainofresponsibility.pedidos.Pedido;

public class CalculadoraFrete implements ProcessadorPedido {
	private ProcessadorPedido proximoProcessador;

	@Override
	public void setProximoProcessador(ProcessadorPedido proximoProcessador) {
		this.proximoProcessador = proximoProcessador;
	}

	@Override
	public void processarPedido(Pedido pedido) {
		// Calcula o frete para o pedido
		System.out.println("Calculando frete...");
		// Implementação da lógica de cálculo de frete
		if (proximoProcessador != null) {
			proximoProcessador.processarPedido(pedido);
		}
	}
}
