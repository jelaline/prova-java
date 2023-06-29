/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.provajava;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    
    BAHIA ("Bahia", "BA"),
    RIO_DE_JANEIRO ("Rio de Janeiro", "RJ"),
    SAO_PAULO ("São Paulo", "SP");
    
    protected final String nome;
    protected final String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
    
    
}
