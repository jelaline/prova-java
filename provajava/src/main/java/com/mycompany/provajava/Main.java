/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.provajava;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
      
   Motoboy motoboy = new Motoboy("787bb", "Carlos", "7473463784634", "7327373743", Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 500, EstadoCivil.CASADO, LocalDate.of(1997, Month.MARCH, 21), 
      new Endereco("Avenida João", "54", "Casa 2", "45983843", "Salvador", UnidadeFederativa.BAHIA));
      
      Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Jessica", "7437784374374", "8487474575", Setor.RECURSOS_HUMANOS, Genero.FEMININO, 500000, EstadoCivil.SOLTEIRO, LocalDate.of(1998, Month.MARCH, 27), 
      new Endereco("Rua da Penha", "43", "casa 3", "40866363", "Salvador", UnidadeFederativa.BAHIA));
      
   Engenheiro engenheiro =  new Engenheiro("783783483", "Marcos", "6337474348", "7474778443", Setor.ENGENHARIA, Genero.MASCULINO, 150000, EstadoCivil.CASADO, LocalDate.of(1995, Month.MARCH, 25), 
   new Endereco("Rua Paraguai", "78", "Predio Comercial", "40555552", "Buzios", UnidadeFederativa.RIO_DE_JANEIRO));
   
   Gerente gerente = new Gerente(Bonificacao.GERENTE, "Maria", "663347343854545", "78437848743", Setor.MARKETING, Genero.FEMININO, 15000, EstadoCivil.DIVORCIADO, LocalDate.of(1997, Month.AUGUST, 14),
   new Endereco("Rua Terezina", "45", "predio solar", "78787898", "Santa Cruz", UnidadeFederativa.SAO_PAULO));
   
  
      
      
      
    diretor.admitir(motoboy);
    
        System.out.println("");
    
    diretor.demitir(engenheiro);
       
    System.out.println("");
        
     diretor.demitir(gerente);
     
        System.out.println("");
        
        diretor.admitir(diretor);
        
    
    
      
      
        
    }
}