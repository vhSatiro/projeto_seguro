package saude;

import java.util.ArrayList;
import java.util.List;

public class Ambulatorial extends Procedimento{
    private int qtdTecnicos;
    private List<Clinica> clinicas = new ArrayList<>();

    public Ambulatorial(int qtdTecnicos, String nomeProc, ItemProcedimento lista) {
        super(nomeProc, lista);
        this.qtdTecnicos = qtdTecnicos;
    }

    public List<Clinica> getClinicas() {
        return clinicas;
    }

    public void setClinicas(Clinica c) {
        clinicas.add(c);
    }
     
    

    public int getQtdTecnicos() {
        return qtdTecnicos;
    }

    public void setQtdTecnicos(int qtdTecnicos) {
        this.qtdTecnicos = qtdTecnicos;
    }
    
    
}
