package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos

    private Map<String, Integer> agendaContatoMap;


    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();

    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }


    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pedro", 123456);
        agendaContatos.adicionarContato("Pedro", 54321);
        agendaContatos.adicionarContato("Pedro Henrique", 1111111);
        agendaContatos.adicionarContato("Pedro DIO", 654325);
        agendaContatos.adicionarContato("Damaris", 1111111);
        agendaContatos.adicionarContato("Pedro", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Damaris");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Pedro DIO"));
    }
}