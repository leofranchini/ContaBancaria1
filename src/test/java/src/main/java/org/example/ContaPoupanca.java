package src.main.java.org.example;

public class ContaPoupanca extends ContaBancaria {

    private Cliente cliente;
    private float saldo;
    private double taxaRendimento;


    public ContaPoupanca(int numConta, String tipo, String dono, float saldo, boolean status, Cliente cliente, double saldo1, double taxaRendimento) {
        super(numConta, tipo, dono, saldo, status);
        this.cliente = cliente;
        this.saldo = saldo;
        this.taxaRendimento = taxaRendimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void sacarContaPoupanca(double v) {
    }
}