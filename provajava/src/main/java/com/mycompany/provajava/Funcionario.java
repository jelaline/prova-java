/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provajava;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario implements SalarioFinal{
    
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Setor setor;
    protected Genero genero;
    protected double salario;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;
    protected Endereco endereco;

    public Funcionario(String nome, String cpf, String rg, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.setor = setor;
        this.genero = genero;
        this.salario = salario;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

   
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return 
                "\n Nome: " + nome +
                "\n cpf: " + cpf +
                "\n rg: " + rg +
                "\n setor: " + setor.nome +
                "\n genero: " + genero.texto +
                "\n salario: " + Util.formatarDinheiro(salario) +
                "\n estadoCivil: " + estadoCivil.texto + 
                "\n data de Nascimento: " + Util.formatarData(dataNascimento) +
                "\n endereco: " + endereco +
                "\n Idade: " + getIdade();
    }
    
    
    
}
