/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provajava;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfianca extends Funcionario{
    
    
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Endereco endereco) {
        super(nome, cpf, rg, setor, genero, salario, estadoCivil, dataNascimento, endereco);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return super.toString()+
                
                "\n Bonificacao: " + bonificacao.valor;
    }

   
    
    
}
