package br.com.sd.comissoes.view;

import br.com.sd.comissoes.dominio.Caixa;
import br.com.sd.comissoes.dominio.Produto;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class CaixaBean implements Serializable{
    
    private Caixa caixa;
    private String filtro;
    private List<Produto> produtos;

    public CaixaBean() {
        this.caixa = new Caixa();
    }
    
    public void salvar() {
        validaCampos();
    }
    
    public void validaCampos() {
        if (caixa.getData() == null) {
            adicionarMensagem("form:data", 
                    FacesMessage.SEVERITY_ERROR, 
                    "Informe a data!", 
                    "Data não pode ser vazia.");
        }
        FacesContext context = FacesContext.getCurrentInstance();
        if (!context.getMessages().hasNext()) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, 
                    "Sucesso!", 
                    "Caixa fechado.");
            context.addMessage(null, fm);
        }
    }
    
    public void adicionarMensagem(String clientID,
            FacesMessage.Severity severity,
            String summary,
            String detail) {
        
        FacesMessage fm = new FacesMessage(severity, summary, detail);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(clientID, fm);
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
}
