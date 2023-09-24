import org.junit.jupiter.api.Test;
import src.main.java.org.example.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BancoTest {

    @Test
    public void testDepositoContaCorrente() {
        Cliente cliente = new Cliente("Cliente 1", "123456789", 3000.0, "Pessoa Física");
        ContaCorrente contaCorrente = new ContaCorrente(1, "Corrente", "Cliente 1", 1000.0, true, cliente, 500.0, 0.02);
        contaCorrente.depositar(200.0);
        assertEquals(1200.0, contaCorrente.getSaldoContaCorrente(), 0.01);
    }

    @Test
    public void testSaqueContaPoupanca() {
        Cliente cliente = new Cliente("Cliente 2", "987654321", 5000.0f, "Pessoa Física");
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, "Poupança", "Cliente 2", 500.0f, true, cliente, 500.0, 0.05);
        contaPoupanca.sacar(100.0);
        assertEquals(400.0, contaPoupanca.getSaldo(), 0.01);
    }

    @Test
    public void testPagamentoComSaldoSuficiente() {
        Cliente cliente = new Cliente("Pedro", "000", 3000, "Pessoa Física");
        ContaCorrente contaCorrente = new ContaCorrente(3, "Corrente", cliente, 2000, true);

        double valorPagamento = 1000.0;

        cliente.pagar(valorPagamento);

        double saldoAtual = contaCorrente.getSaldo();
        double saldoEsperado = 1000.0;

        assertEquals(saldoEsperado, saldoAtual, 0.0);
    }

    @Test
    public void testDepositoEmContaCorrente() {
        Cliente cliente = new Cliente("Ana", "1111", 5000, "Pessoa Física");
        ContaCorrente contaCorrente = new ContaCorrente(4, "Corrente", Cliente, 1000, true);

        double valorDeposito = 500.0;

        contaCorrente.depositar(valorDeposito);

        double saldoAtual = contaCorrente.getSaldo();
        double saldoEsperado = 1500.0;

        assertEquals(saldoEsperado, saldoAtual, 0.0);
    }
}
