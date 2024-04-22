package chainofresponsibility.pedidos;

import chainofresponsibility.pedidos.elos.AplicadorDesconto;
import chainofresponsibility.pedidos.elos.CalculadoraFrete;
import chainofresponsibility.pedidos.elos.ProcessadorPedido;
import chainofresponsibility.pedidos.elos.VerificarDisponibilidadeEstoque;

public class Main {

	public static void main(String[] args) {
		ProcessadorPedido verificadorEstoque = new VerificarDisponibilidadeEstoque();
		ProcessadorPedido aplicadorDesconto = new AplicadorDesconto();
        ProcessadorPedido calculadoraFrete = new CalculadoraFrete();
        
        ProcessadorPedido corrente = CriarCorrente.criarCorrente(verificadorEstoque, aplicadorDesconto, calculadoraFrete);
        
        Pedido pedido = new Pedido("Produto A", 2);
        corrente.processarPedido(pedido);
//        verificadorEstoque.setProximoProcessador(aplicadorDesconto);
//        aplicadorDesconto.setProximoProcessador(calculadoraFrete);
//        
//        verificadorEstoque.processarPedido(pedido);
	}

}
