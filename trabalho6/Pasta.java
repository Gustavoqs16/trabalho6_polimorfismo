/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho6;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Pasta {
    private String nome;
    private ArrayList<Arquivo> arquivos;
    
    public Pasta(String n){
        this.nome = n;
        this.arquivos = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }
    public void inserir(Arquivo arq){
        this.arquivos.add(arq);
    }
    public void remover (String nomeArq){
        Arquivo arq = encontraArq(nomeArq);
        if (arq != null){
            arquivos.remove(arq);
        }else {
            System.out.println("Arquivo [" + nomeArq + "] inexistente");
        }
    }
    public void duplicar(String nomeArq){
        Arquivo arq = encontraArq(nomeArq);
        if (arq != null){
            Arquivo arqDuplicado = new Arquivo(arq.nome + "(copia)", arq.endereco, arq.totalBlocos);
            arquivos.add(arq);
        }else{
            System.out.println("Arquivo [" + nomeArq + "] inexistente");
        }
    }
    private Arquivo encontraArq(String nomeArq) {
        Arquivo arq = null;
        for (Arquivo a: arquivos){
            if(a.getNome().equals(nomeArq));
            arq = a;
        }
        return arq;
    }
    public void listar(){
        System.out.println(" - Pasta [" + nome + "]");
        arquivos.forEach((a) -> {
            a.imprimirNome();
        });
    }
    public Compactado compactar(){
        Compactado c = new Compactado(this.nome, 0, arquivos.size());
        arquivos.forEach((a) -> {
            c.compactarArquivo(a);
        });
        return c;
    }
    public void abrirTodosArquivos (){
        System.out.println(" - Pasta [" + nome + "] ");
        for (Arquivo a : arquivos){
            System.out.println(" Abrindo arquivo: ");
            a.abrir();
        }
    }
    public void imprimirNome(){
        System.out.println("Pasta: " + this.nome);
    }
    
}
