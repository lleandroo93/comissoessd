package br.com.sd.comissoes.bean;

import br.com.sd.comissoes.dominio.Produto;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class ProdutoBean implements Serializable{
    
    private Produto produto;

    public ProdutoBean() {
        this.produto = new Produto();
    }    

    public Produto getProduto() {
        return produto;
    }
    
    public void salvar() {
        validaCampos();
        FacesContext context = FacesContext.getCurrentInstance();
        if (!context.getMessages().hasNext()) {
            FacesMessage fm = new FacesMessage("Sucesso!", "Produto salvo.");
            context.addMessage(null, fm);
        }
    }

    private void validaCampos() {
        if ("".equals(produto.getNome())) {
            adicionarMensagem("formulario:nome",
                    FacesMessage.SEVERITY_ERROR,
                    "Informe o nome",
                    "O nome do produto não pode ser vazio.");
        }
        if (produto.getEstoque() == null) {
            adicionarMensagem("formulario:estoque",
                    FacesMessage.SEVERITY_ERROR,
                    "Informe o estoque",
                    "O estoque do produto não pode ser vazio.");
        }
        if (produto.getPreco() == null) {
            adicionarMensagem("formulario:preco",
                    FacesMessage.SEVERITY_ERROR,
                    "Informe o preço",
                    "O preço do produto não pode ser vazio.");
        }
    }
    
    public void adicionarMensagem(String clientID, 
                                    FacesMessage.Severity severity, 
                                    String summary, 
                                    String detail) {
        
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage fm = new FacesMessage(severity, summary, detail);
        context.addMessage(clientID, fm);
    }
       
}
