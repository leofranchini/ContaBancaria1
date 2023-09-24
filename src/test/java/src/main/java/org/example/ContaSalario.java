package src.main.java.org.example;

public class ContaSalario extends ContaBancaria{
    private Cliente cliente;
    private float saldo;
    private double taxaRendimento;
    private double limiteSaque;

    public ContaSalario(int numConta, String tipo, String dono, float saldo, boolean status, Cliente cliente, float saldo1, double taxaRendimento) {
        super(numConta, tipo, dono, saldo, status);
        this.cliente = cliente;
        this.saldo = saldo1;
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

    @Override
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void sacarContaSalario(double valor) {
        if (valor > 0 && valor <= saldo && valor <= limiteSaque) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente, valor de saque inválido ou excedeu o limite de saque diário.");
        }
    }

    public void depositarContaSalario(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }


}
