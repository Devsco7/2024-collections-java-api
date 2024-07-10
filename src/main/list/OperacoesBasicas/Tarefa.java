package main.list.OperacoesBasicas;

public class Tarefa {
    //atritubo

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao;
    }
}
