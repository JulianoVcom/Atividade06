package jrr.atividade06;

/**
 * @author Juliano
 */
public class NotaFiscal {

    String nomecli; 
    double vfatura; 
    double imposto;
    
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
