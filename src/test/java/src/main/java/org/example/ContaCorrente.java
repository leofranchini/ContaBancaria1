package src.main.java.org.example;

public class ContaCorrente extends ContaBancaria {

    private Cliente cliente;
    private double saldoContaCorrente;
    double taxaRendimento;

    public ContaCorrente(int numConta, String tipo, String dono, float saldo, boolean status, Cliente cliente, double saldoContaCorrente, double taxaRendimento) {
        super(numConta, tipo, dono, saldo, status);
        this.cliente = cliente;
        this.saldoContaCorrente = saldoContaCorrente;
        this.taxaRendimento = taxaRendimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    public void setSaldoContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void depositarContaCorrente (double valor) {
        if (valor > 0) {
            saldoContaCorrente = valor;
            System.out.println("Deposito de R$" + valor + "feito com sucesso");
        } else {
            System.out.println("Valor invalido para deposito");
        }
    }

    public void sacarContaCorrente (double valor) {
        if (valor > 0 && valor <= saldoContaCorrente) {
            saldoContaCorrente -= valor;
            System.out.println("Saldo de R$" + valor + "realizado");
        }
    }


}
