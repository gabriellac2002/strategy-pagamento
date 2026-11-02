package br.com.padroes.strategypagamento;

public class Pagamento {

    private float valorPago;

    public float getValorPago() {
        return valorPago;
    }

    public void pagarComPix(float valorCompra, float desconto) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valorCompra, desconto);
        this.valorPago = processador.processar(new PagamentoPix());
    }

    public void pagarComBoleto(float valorCompra, float desconto) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valorCompra, desconto);
        this.valorPago = processador.processar(new PagamentoBoleto());
    }

    public void pagarComCartaoDebito(float valorCompra, float desconto) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valorCompra, desconto);
        this.valorPago = processador.processar(new PagamentoCartaoDebito());
    }

    public void pagarComCartaoCredito(float valorCompra, float juros) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valorCompra, juros);
        this.valorPago = processador.processar(new PagamentoCartaoCredito());
    }

    public void pagarEmDinheiro(float valorCompra, float desconto) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valorCompra, desconto);
        this.valorPago = processador.processar(new PagamentoDinheiro());
    }
}
