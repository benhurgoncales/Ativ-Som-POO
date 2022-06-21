//Classe filha de Atleta
package com.mycompany.ativsomativa;

public class Saltador extends Atleta {
    //ATRIBUTO
    private String altura;
    
    // METODO CONSTRUTOR
    public Saltador(String nome, String numero, String altura) {
        super(nome, numero, "Saltador");
        this.altura = altura;
    }
    
    // GETTERS AND SETTERS
    public String getAltura() {
        return this.altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    
    //toString sobrescrevendo o metodo toString da mae 
    @Override
    public String toString() {
        return super.toString() + "Altura do salto: " + this.getAltura();
    }
}
