package main.list.Pesquisa;

import main.list.OperacoesBasicas.Convidado;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;

    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contaoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contaoAtualizado = c;
                break;
            }
        }
        return contaoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Pedro", 123456);
        agendaContatos.adicionarContato("Pedro", 489512);
        agendaContatos.adicionarContato("Pedro Henrique", 111111);
        agendaContatos.adicionarContato("Pedro SCO", 702202);
        agendaContatos.adicionarContato("Damaris", 111111);


        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Damaris"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Damaris", 555555));

        agendaContatos.exibirContatos();
    }

}


