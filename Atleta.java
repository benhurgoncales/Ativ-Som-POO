package com.mycompany.ativsomativa;

import java.io.Serializable;

public class Atleta implements Serializable {
    // ATRIBUTOS

    private String nome;
    private String numero;
    private String categoria;

    //Metodo Construdor
    public Atleta(String nome, String numero, String categoria) {
        this.nome = nome;
        this.numero = numero;
        this.categoria = categoria;
    }

    public Atleta() {
    }
    
    //METODOS GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    // Metodo toString() sobre

    public String toString() {
        String retorno;

        retorno = "--------------------------"
                + "Categoria: " + this.getCategoria()
                + "--------------------------\n"
                + "Nome: " + this.getNome() + "\n"
                + "Número: " + this.getNumero() + "\n";
        return retorno;
    }
}
