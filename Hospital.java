package saude;

import java.util.ArrayList;

public class Hospital extends Local {
    private int qtdMedicos;
    private ArrayList<Cirurgico> cirurgicos; 
    
    public Hospital(int qtdMedicos, long cep) {
        super(cep);
        this.qtdMedicos = qtdMedicos;
    }
    
    
    public int getQtdMedicos() {
        return qtdMedicos;
    }

    public void setQtdMedicos(int qtdMedicos) {
        this.qtdMedicos = qtdMedicos;
    }

    public ArrayList<Cirurgico> getCirurgicos() {
        return cirurgicos;
    }


    public void addCirurgico(Cirurgico cirurgico) {
        cirurgicos.add(cirurgico);
    }

    
}
