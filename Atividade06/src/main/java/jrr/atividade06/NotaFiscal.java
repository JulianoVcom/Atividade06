/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrr.atividade06;


/**
 *
 * @author juliano
 */
public class NotaFiscal {

    String nomecli; 
    double vfatura; 
    double imposto;
    //Cliente pcli, Fatura pfatura, double pImposto
    public NotaFiscal() {
    }

    public NotaFiscal(String pNomecli, double pvfatura, double pImposto) {
        nomecli = pNomecli;
        vfatura = pvfatura;
        imposto = pImposto;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public double getVfatura() {
        return vfatura;
    }

    public void setVfatura(double vfatura) {
        this.vfatura = vfatura;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
  

    
}
