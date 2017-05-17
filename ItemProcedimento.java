package saude;

import java.util.Date;

public class ItemProcedimento {
    private int qtd;
    private String descricao;
    private Autorizacao autorizacao;
    private Date data;
    private Local local;
    
    public ItemProcedimento(int qtd){
        this.qtd = qtd;
        autorizacao = new Autorizacao(data,local);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Autorizacao getAutorizacao() {
        return autorizacao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
