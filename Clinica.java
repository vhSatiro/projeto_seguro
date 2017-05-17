package saude;

import java.util.ArrayList;

public class Clinica extends Local {
    private String Medico;
    private ArrayList<Ambulatorial> ambulatorios;
    

    public Clinica(String Medico, long cep) {
        super(cep);
        this.Medico = Medico;
    }
    

    public String getMedico() {
        return Medico;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public ArrayList<Ambulatorial> getAmbulatorios() {
        return ambulatorios;
    }

    public void setAmbulatorios(Ambulatorial ambulatorio) {
        ambulatorios.add(ambulatorio);       
        
    }
    
    
}
