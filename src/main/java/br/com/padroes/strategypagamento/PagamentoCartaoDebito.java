package br.com.padroes.strategypagamento;

public class PagamentoCartaoDebito implements FormaPagamento {

    public float calcularValorFinal(float valorCompra, float percentual) {
        return valorCompra - (valorCompra * percentual / 100);
    }
}
