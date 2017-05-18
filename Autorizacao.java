package saude;

import java.util.Date;

public class Autorizacao {
    private Date data;
    private Estado status;
    private Local local;
    
    public Autorizacao(Date data,Local local){
        this.status = (Estado.Pendente);
        this.data = data;        
        this.local = local;
    }
    
    public Autorizacao(){};
    
    //Utilização do padrão Grasp - Creator
    public void CriaItem(int qtd){
        this.item = new ItemProcedimento(qtd);
    }
    
    
    public void setLocal(Local local){
        this.local = local;    
    }
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Estado getStatus() {
        return status;
    }
        
    public void autorizar(){
        this.status = (Estado.Autorizado);
    }
    
    public void negar(){
        this.status = (Estado.Negado);
    }
     
}
