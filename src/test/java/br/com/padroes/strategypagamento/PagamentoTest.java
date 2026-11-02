package br.com.padroes.strategypagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PagamentoTest {

    @Test
    void devePagarComPix() {
        Pagamento pagamento = new Pagamento();
        pagamento.pagarComPix(100.0f, 10.0f);
        assertEquals(90.0f, pagamento.getValorPago());
    }

    @Test
    void devePagarComBoleto() {
        Pagamento pagamento = new Pagamento();
        pagamento.pagarComBoleto(100.0f, 5.0f);
        assertEquals(95.0f, pagamento.getValorPago());
    }

    @Test
    void devePagarComCartaoDebito() {
        Pagamento pagamento = new Pagamento();
        pagamento.pagarComCartaoDebito(100.0f, 2.0f);
        assertEquals(98.0f, pagamento.getValorPago());
    }

    @Test
    void devePagarComCartaoCredito() {
        Pagamento pagamento = new Pagamento();
        pagamento.pagarComCartaoCredito(100.0f, 5.0f);
        assertEquals(105.0f, pagamento.getValorPago());
    }

    @Test
    void devePagarEmDinheiro() {
        Pagamento pagamento = new Pagamento();
        pagamento.pagarEmDinheiro(100.0f, 15.0f);
        assertEquals(85.0f, pagamento.getValorPago());
    }
}
