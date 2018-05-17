/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrr.atividade06;

/**
 *
 * @author Juliano
 */
public class GeradorDeNotaFiscal {
    
    public GeradorDeNotaFiscal() {
    }

    public double GeradorDeNotaFiscal(Fatura fat) {
        double vImposto=0;  
        
        if (fat.getTpServico() == "consultoria")
            vImposto = fat.getvFatura() * 0.25;
        else if (fat.getTpServico() == "treinamento")
            vImposto = fat.getvFatura() * 0.15;
        else 
            vImposto = fat.getvFatura() * 0.06;    
        
        return vImposto; 
    }
    
}
