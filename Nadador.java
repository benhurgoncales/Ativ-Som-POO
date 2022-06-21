// Classe filha de atleta
package com.mycompany.ativsomativa;

public class Nadador extends Atleta {
    //ATRIBUTO
    private String estilo;
    
    // METODO CONSTRUTOR
    public Nadador(String nome, String numero, String estilo) {
        super(nome, numero, "Nadador");
        this.estilo = estilo;
    }
    
    // GETTERS AND SETTERS
    public String getEstilo() {
        return this.estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    //toString sobrescrevendo o metodo toString da mae 
    @Override
    public String toString() {
        return super.toString() + "Estilo: " + this.getEstilo();
    }
}
