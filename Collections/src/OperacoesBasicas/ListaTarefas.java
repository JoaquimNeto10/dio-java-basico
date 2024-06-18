package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

     private List<Tarefa> tarefaList;


    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefa(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa2");

        System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.removerTarefa("Tarefa2");
        System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.obterDescricoesTarefa();

    }

    
}
