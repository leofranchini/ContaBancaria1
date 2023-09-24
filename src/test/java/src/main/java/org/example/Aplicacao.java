package src.main.java.org.example;

import java.util.Date;

public class Aplicacao {

     private Cliente cliente;
     private Date dataInicioAplicacao;
     private Date dataFimAplicacao;
     private double valorInvestido;
     private double taxaJuros;
     private double rendimento;
     private boolean statusAplicacao;

     public Aplicacao(Cliente cliente, Date dataInicioAplicacao, Date dataFimAplicacao, double valorInvestido, double taxaJuros, double rendimento, boolean statusAplicacao) {
          this.cliente = cliente;
          this.dataInicioAplicacao = dataInicioAplicacao;
          this.dataFimAplicacao = dataFimAplicacao;
          this.valorInvestido = valorInvestido;
          this.taxaJuros = taxaJuros;
          this.rendimento = rendimento;
          this.statusAplicacao = statusAplicacao;
     }

     public Cliente getCliente() {
          return cliente;
     }

     public void setCliente(Cliente cliente) {
          this.cliente = cliente;
     }

     public Date getDataInicioAplicacao() {
          return dataInicioAplicacao;
     }

     public void setDataInicioAplicacao(Date dataInicioAplicacao) {
          this.dataInicioAplicacao = dataInicioAplicacao;
     }

     public Date getDataFimAplicacao() {
          return dataFimAplicacao;
     }

     public void setDataFimAplicacao(Date dataFimAplicacao) {
          this.dataFimAplicacao = dataFimAplicacao;
     }

     public double getValorInvestido() {
          return valorInvestido;
     }

     public void setValorInvestido(double valorInvestido) {
          this.valorInvestido = valorInvestido;
     }

     public double getTaxaJuros() {
          return taxaJuros;
     }

     public void setTaxaJuros(double taxaJuros) {
          this.taxaJuros = taxaJuros;
     }

     public boolean getStatusAplicacao() {
          return statusAplicacao;
     }

     public void setStatusAplicacao(boolean statusAplicacao) {
          this.statusAplicacao = statusAplicacao;
     }

     public double getRendimento() {
          return rendimento;
     }

     public void setRendimento(double rendimento) {
          this.rendimento = rendimento;
     }

     public boolean isStatusAplicacao() {
          return statusAplicacao;
     }

     public double calculaRendimentoDaAplicacao() {
          if (statusAplicacao == true) {

               double taxaMensal = 0.05;
               double rendimento = getValorInvestido() * getTaxaJuros();

               }
          return  rendimento;
          }

     public String exibeInfosDaAplicacoes() {
          String informacoes = "Informacoes da Aplicaçao:  \n";
          informacoes ="Cliente: " + cliente.getNomeCliente() + "\n";
          informacoes = "Data do incicio" + getDataInicioAplicacao();
          informacoes = "Data do termino" + getDataFimAplicacao() + "\n";
          informacoes = "Valor Investido" + getValorInvestido() + "\n";
          informacoes = "Rendimento" + getRendimento() + "\n";

          return  informacoes;
     }


}
