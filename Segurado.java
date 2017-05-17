package saude;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 41506375
 */
public class Segurado{
    
    private String nomeSegurado;
    private long cpf;
    private ArrayList<PlanoDeSaude> planos;
 
    
    public Segurado(String nomeSegurado, long cpf, PlanoDeSaude plano){
        this.nomeSegurado = nomeSegurado;
        this.cpf = cpf;
        planos = new ArrayList<>();
        planos.add(plano);
        plano.addSegurado(this);
        
    }
    public Segurado(){
        planos = new ArrayList<>();
    }

    public void setPlano(PlanoDeSaude plano){
        planos.add(plano);
        plano.addSegurado(this);
        
    }
    public void addPlano(PlanoDeSaude x) {
        planos.add(x);
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public ArrayList<PlanoDeSaude> getPlanos() {
        return planos;
    }
    
    
    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }
  
    public long getCpf() {
        return cpf;
    }
    
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
//
//    @Override
//    
//    public String toString(){
//        String x = "";
//        for(PlanoDeSaude nome: planos){
//            x += nome.getNomePlano()+" ";            
//        }
//        return "Nome:"+nomeSegurado+"\nPlano(s):"+x+"\nCPF:"+cpf;
//    }
//    
    
}
