/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrr.atividade06;



/**
 *
 * @author julia
 */
public class Fatura {
    Cliente cli;
    String tpservico;
    double vfatura;
    
    
    public Fatura(Cliente pCli, String pServico, double pvFatura) {
        cli = pCli;
        tpservico = pServico;
        vfatura = pvFatura;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public String getTpServico() {
        return tpservico;
    }

    public void setTpServico(String tpServico) {
        this.tpservico = tpServico;
    }

    public double getvFatura() {
        return vfatura;
    }

    public void setvFatura(double vFatura) {
        this.vfatura = vFatura;
    }
    
}
