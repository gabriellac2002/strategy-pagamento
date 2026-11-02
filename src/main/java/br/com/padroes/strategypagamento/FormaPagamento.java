package br.com.padroes.strategypagamento;

public interface FormaPagamento {

    float calcularValorFinal(float valorCompra, float percentual);
}
