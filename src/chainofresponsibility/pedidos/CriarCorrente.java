package chainofresponsibility.pedidos;

import chainofresponsibility.pedidos.elos.ProcessadorPedido;

public class CriarCorrente {

	public static ProcessadorPedido criarCorrente(ProcessadorPedido primeiro, ProcessadorPedido... corrente) {
        ProcessadorPedido head = primeiro;
        for (ProcessadorPedido proximoNaCorrente : corrente) {
            head.setProximoProcessador(proximoNaCorrente);
            head = proximoNaCorrente;
        }
        return primeiro;
    }
}
