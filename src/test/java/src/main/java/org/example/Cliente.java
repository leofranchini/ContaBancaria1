package src.main.java.org.example;

public class Cliente {

    private String nomeCliente;
    private String cpfCliente;
    private float rendaMensal;
    private String tipoCliente;
    private double saldo;

    public Cliente(String nomeCliente, String cpfCliente, float rendaMensal, String tipoCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.rendaMensal = rendaMensal;
        this.tipoCliente = tipoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public float getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(float rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String exibeInformacoesCliente() {
        return "Nome: " + getNomeCliente() + "\n" +
                "CPF" + getCpfCliente() + "\n";

    }
    public boolean pagar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true; 
        } else {
            return false;
        }
    }
}
