package saude;

import java.util.ArrayList;

public class Cirurgico extends Procedimento{
    private int qtdMedicos;
    private ArrayList<Hospital> hospitais;
   
    public Cirurgico(int qtdMedicos, String nomeProc, ItemProcedimento lista) {
        super(nomeProc, lista);
        this.qtdMedicos = qtdMedicos;
    }

    public int getQtdMedicos() {
        return qtdMedicos;
    }

    public void setQtdMedicos(int qtdMedicos) {
        this.qtdMedicos = qtdMedicos;
    }

    public ArrayList<Hospital> getHospitais() {
        return hospitais;
    }

    public void setHospitais(Hospital hospital) {
        hospitais.add(hospital);
    }
    
    
    
}
