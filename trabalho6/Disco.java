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
public class Disco {
    private char nome;
    private ArrayList<Pasta> pastas;
    
    public Disco(char n){
        this.nome = n;
        pastas = new ArrayList<>();
    }    
    public Pasta criarPasta (String nome){
        Pasta p = new Pasta(nome);
        pastas.add(p);
        return p;
    }
    public void remover (String nomePasta){
        Pasta p = encontraPasta(nomePasta);
        if (p != null){
            pastas.remove(p);
        }else {
            System.out.println("Pasta [" + nomePasta + "] inexistente");
        }
    }
    public Pasta encontraPasta(String nomePasta){
        Pasta pasta = null;
        for (Pasta p : pastas) {
            if(p.getNome().equals(nomePasta));
            pasta = p;
        }
        return pasta;
    }
    public void listar (){
        System.out.println(" - Disco [" + nome + ":\\] ");
        pastas.forEach((p) -> {
            p.listar();
        });
    }
}
