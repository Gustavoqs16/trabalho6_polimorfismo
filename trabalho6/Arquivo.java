/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho6;

/**
 *
 * @author pc
 */
public class Arquivo {
    protected String nome;
    protected int endereco;
    protected int totalBlocos;
    
    public Arquivo(String n, int e, int b){
        this.endereco = e;
        this.nome = n;
        this.totalBlocos = b;
    }
    public String getNome(){
        return this.nome;
    }
    public void imprimirNome(){
        System.out.println(" ." + this.nome);
    }
    public void abrir(){
        System.out.println(this.nome);
    }
}
