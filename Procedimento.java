package saude;
public class Procedimento {
    private String nomeProc;
    private ItemProcedimento lista;
    
    public Procedimento(String nomeProc, ItemProcedimento lista){
        this.nomeProc = nomeProc; 
        this.lista = lista;
    
    }

    public String getNomeProc() {
        return nomeProc;
    }

    public void setNomeProc(String nomeProc) {
        this.nomeProc = nomeProc;
    }

    public ItemProcedimento getLista() {
        return lista;
    }

    public void setLista(ItemProcedimento lista) {
        this.lista = lista;
    }
    
}
