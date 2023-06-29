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
public class Diretor extends CargoDeConfianca implements Contratacao{
    
    private final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Endereco endereco) {
        super(bonificacao, nome, cpf, rg, setor, genero, salario, estadoCivil, dataNascimento, endereco);
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salario * this.PREMIO;
        salarioFinal += super.salario;
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir o funcionario" + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir o funcionario" + funcionario.toString());
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n PREMIO: " + PREMIO;
    }

   
    
}
