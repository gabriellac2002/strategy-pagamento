package br.com.padroes.strategypagamento;

public class ProcessadorPagamento {

    private final float valorCompra;
    private final float percentual;

    public ProcessadorPagamento(float valorCompra, float percentual) {
        this.valorCompra = valorCompra;
        this.percentual = percentual;
    }

    public float processar(FormaPagamento formaPagamento) {
        return formaPagamento.calcularValorFinal(valorCompra, percentual);
    }
}
