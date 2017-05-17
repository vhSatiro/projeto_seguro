package saude;

import java.util.ArrayList;

public class Operadora {
    private String nomeOp;
    private ArrayList<PlanoDeSaude> planosDaOperadora;

    
    public Operadora(String nome){
        planosDaOperadora = new ArrayList<>();  
        this.nomeOp = nome;
        
    }
    public Operadora(){
    }

    public String getNomeOp() {
        return nomeOp;
    }

    public ArrayList<PlanoDeSaude> getPlanos() {
        return planosDaOperadora;
    }

    public void addPlano(PlanoDeSaude x) {
        planosDaOperadora.add(x);
    }
    
  
}
