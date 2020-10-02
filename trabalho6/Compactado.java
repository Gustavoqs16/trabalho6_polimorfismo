/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pc
 */
public class Compactado extends Arquivo {
    private ArrayList<Arquivo> arquivos;
    
    public Compactado(String nome, int endereco, int totalBlocos){
        super(nome, endereco, totalBlocos);
        arquivos = new ArrayList<>();
    }
    public void compactarArquivo (Arquivo a) {
        arquivos.add(a);
    }
    public void abrir (Disco d){
        Pasta pastaDescompactada = d.criarPasta(this.nome);
        arquivos.forEach((a) -> {
            pastaDescompactada.inserir(a);
        });
    }
}
