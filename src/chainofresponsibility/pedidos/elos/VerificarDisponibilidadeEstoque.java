package chainofresponsibility.pedidos.elos;

import chainofresponsibility.pedidos.Pedido;

public class VerificarDisponibilidadeEstoque implements ProcessadorPedido{

	private ProcessadorPedido proximoProcessador;
	
	@Override
	public void processarPedido(Pedido pedido) {
		System.out.println("Verificando disponibilidade de estoque...");
		if(proximoProcessador != null) {
			proximoProcessador.processarPedido(pedido);
		}
	}

	@Override
	public void setProximoProcessador(ProcessadorPedido proximoProcessador) {
		this.proximoProcessador = proximoProcessador;
		
	}

}
