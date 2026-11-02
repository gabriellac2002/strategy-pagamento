package br.com.padroes.strategypagamento;

public class PagamentoCartaoCredito implements FormaPagamento {

    public float calcularValorFinal(float valorCompra, float percentual) {
        return valorCompra + (valorCompra * percentual / 100);
    }
}
