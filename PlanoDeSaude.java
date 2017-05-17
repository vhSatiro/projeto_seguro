package saude;

import java.util.ArrayList;

public class PlanoDeSaude {

    private int NumeroDeAutorizacao;
    private String nomePlano;
    private ArrayList<Segurado> segurado;
    private ArrayList<Procedimento> procedimentos;
    private Operadora operadora;
    
    public PlanoDeSaude(String nomePlano,int NumeroDeAutorizacao,Operadora operadora){
        this.nomePlano = nomePlano; 
        this.NumeroDeAutorizacao = NumeroDeAutorizacao;
        this.operadora = operadora;
        segurado = new ArrayList<>();
        procedimentos = new ArrayList<>();
        operadora.addPlano(this);
        
    }

    public ArrayList<Procedimento> getProcedimento() {
        return procedimentos;
    }

    public void addProcedimento(Procedimento y) {
        procedimentos.add(y);
    }

    public Operadora getOperadora() {
        return operadora;
    }

    
    public void addSegurado(Segurado y) {
        segurado.add(y);
    }
    
    public int getNumeroDeAutorizacao() {
        return NumeroDeAutorizacao;
    }

    public void setNumeroDeAutorizacao(int NumeroDeAutorizacao) {
        this.NumeroDeAutorizacao = NumeroDeAutorizacao;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }
    
    
//    @Override
//    
//    public String toString(){
//        String x = "";
//        for(Segurado nome: segurado){
//            x += "Nome:"+nome.getNomeSegurado()+"\nCPF:"+nome.getCpf()+"\n";            
//        }
//        return x;
//    }
//    

    public ArrayList<Segurado> getSegurado() {
        return segurado;
    }

    
    
}
