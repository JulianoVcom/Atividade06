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
public class Cliente {
    int codigo;
    String nome;
    String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String pEndereco) {
        endereco = pEndereco;
    }
    
    public Cliente(int pCodigo, String pNome, String pEndereco) {
        codigo = pCodigo;
        nome = pNome;
        endereco = pEndereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int pCodigo) {
        codigo = pCodigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        nome = pNome;
    }

    


   
}
