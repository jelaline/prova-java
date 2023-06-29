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
public class Motoboy extends Funcionario{
    
    private String cnh;

    public Motoboy(String cnh, String nome, String cpf, String rg, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Endereco endereco) {
        super(nome, cpf, rg, setor, genero, salario, estadoCivil, dataNascimento, endereco);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }

    @Override
    public String toString() {
        
        return super.toString()+
                "\n cnh: " + cnh;
    }

    
  
   
   
   
    
}
