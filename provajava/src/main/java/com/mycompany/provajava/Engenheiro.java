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
public class Engenheiro extends Funcionario{
    
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Endereco endereco) {
        super(nome, cpf, rg, setor, genero, salario, estadoCivil, dataNascimento, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }

    @Override
    public String toString() {
        
        return super.toString()+
                  "\n crea: " + crea;
    }

   
    
    
}
