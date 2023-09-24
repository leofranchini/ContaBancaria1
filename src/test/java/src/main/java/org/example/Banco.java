package src.main.java.org.example;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List <ContaBancaria> contas;
    private List <Cliente> clientes;
    private List <Transacao> transacoes;
    private List <Financiamento> financiamentos;
    private List <Aplicacao> aplicacoes;

    public Banco(List<ContaBancaria> contas, List<Cliente> clientes, List<Transacao> transacoes, List<Financiamento> financiamentos, List<Aplicacao> aplicacoes) {
        this.contas = contas;
        this.clientes = new ArrayList<>();
        this.transacoes = transacoes;
        this.financiamentos = financiamentos;
        this.aplicacoes = aplicacoes;
    }

    public Banco() {

    }

    public void abrirConta (ContaBancaria conta) {
        conta.setStatus(true);
        contas.add(conta);
    }

    public void fecharConta(ContaBancaria conta) {
        conta.setStatus(false);
        contas.remove(conta);
    }

    public void registrarAplicacao(Aplicacao aplicacao) {
        aplicacoes.add(aplicacao);
    }

    public List<Aplicacao> listarAplicacoes() {
        return aplicacoes;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public void concederFinanciamento(Financiamento financiamento) {
        financiamentos.add(financiamento);
    }

    public List<Financiamento> listarFinanciamentos() {
        return financiamentos;
    }

}
