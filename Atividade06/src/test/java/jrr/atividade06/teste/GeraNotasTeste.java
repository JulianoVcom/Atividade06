/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrr.atividade06.teste;

import jrr.atividade06.Fatura;
import jrr.atividade06.NotaFiscal;
import jrr.atividade06.GeradorDeNotaFiscal;
import jrr.atividade06.Cliente;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Juliano
 */
public class GeraNotasTeste {

    public GeraNotasTeste() {
    }

    /*@Ignore*/
    @Test
    public void testGeraNotaConsultoria() {

        GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal();

        Cliente Cli = new Cliente(1, "Abgobaldo Ranesio", "Rua das casas, 63");
        Fatura fat = new Fatura(Cli, "consultoria", 100.00);
                     
        NotaFiscal Nt = new NotaFiscal();
        Nt.setNomecli(Cli.getNome());
        Nt.setVfatura(fat.getvFatura());
        Nt.setImposto(gerador.GeradorDeNotaFiscal(fat));
                        
        assertEquals(25, Nt.getImposto(), 1);

    }
    
    //@Ignore
    @Test
    public void testGeraNotaTreinamento() {
        GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal();
      
        Cliente Cli = new Cliente(1, "Stroncio Aguiar","Rua dos testes, 152");
        Fatura fat = new Fatura(Cli,"treinamento",300.00);
                
        NotaFiscal Nt = new NotaFiscal();
        Nt.setNomecli(Cli.getNome());
        Nt.setVfatura(fat.getvFatura());
        Nt.setImposto(gerador.GeradorDeNotaFiscal(fat));
        
        assertEquals(45, Nt.getImposto(),1);
      
    }
        
    @Test
    public void testGeraNotaOutrosTiposServico() {
        GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal();
      
        Cliente Cli = new Cliente(1, "Marcio Teles","Rua do TDD, 223");
        Fatura fat = new Fatura(Cli,"produtos",500.00);
        
        NotaFiscal Nt = new NotaFiscal();
        Nt.setNomecli(Cli.getNome());
        Nt.setVfatura(fat.getvFatura());
        Nt.setImposto(gerador.GeradorDeNotaFiscal(fat));
        
        assertEquals(30, Nt.getImposto(),1);
      
    }
     
}
