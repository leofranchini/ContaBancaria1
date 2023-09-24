package src.main.java.org.example;
import java.util.Date;


public class Financiamento {

    private double valor;
    private double taxaJurosAnual;
    private int meses;
    private Date dataContratacao;
    private ContaBancaria conta;

    public Financiamento(double valor, double taxaJurosAnual, int meses, Date dataContratacao, ContaBancaria conta) {
        this.valor = valor;
        this.taxaJurosAnual = taxaJurosAnual;
        this.meses = meses;
        this.dataContratacao = dataContratacao;
        this.conta = conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }
}
