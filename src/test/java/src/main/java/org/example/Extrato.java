package src.main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Extrato {

    private List<String> transacoes;

    public Extrato(List<String> transacoes) {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(String transacao) {
        transacoes.add(transacao);
    }

    public void mostrarExtrato(){
        System.out.println("Extrato: ");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }
}
