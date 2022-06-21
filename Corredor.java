// Classe filha de atleta
package com.mycompany.ativsomativa;

public class Corredor extends Atleta {
    
    // ATRIBUTO
    private String velocidade;
    
    //METODO CONSTRUTOR
    public Corredor(String nome, String numero, String velocidade) {
        super(nome, numero, "Corredor");
        this.velocidade = velocidade;
    }
    // METODOS GETTER AND SETTERS
    public String getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }
    
    //toString sobrescrevendo o metodo toString da mae 

    @Override
    public String toString() {
        return super.toString() + "Velocidade: " + this.getVelocidade();
    }
}
