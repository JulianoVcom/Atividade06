
package jrr.atividade06;
/**
 * @author Juliano
 */
public class GeradorDeNotaFiscal {
    
    public GeradorDeNotaFiscal() {
    }

    public double GeradorDeNotaFiscal(Fatura fat) {
        return RetornaImposto(fat); 
    }
    
    public double RetornaImposto(Fatura fat){
        double vImposto=0;  
        if (fat.getTpServico() == "consultoria")
            vImposto = fat.getvFatura() * 0.25;
        else if (fat.getTpServico() == "treinamento")
                 vImposto = fat.getvFatura() * 0.15;
             else vImposto = fat.getvFatura() * 0.06; 
        return vImposto; 
        }
    
    public void dispachaNota(NotaFiscal nf){
         Smtp enviaporemail = new Smtp();
         SAP enviaporSAP = new SAP();
         NotaFiscalDao salvaBD = new NotaFiscalDao();
                 
         enviaporemail.envia(nf);
         enviaporSAP.envia(nf);
         salvaBD.salva(nf);
    }
    
}
