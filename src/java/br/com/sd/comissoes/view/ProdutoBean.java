package br.com.sd.comissoes.view;

import br.com.sd.comissoes.dominio.Produto;
import br.com.sd.comissoes.util.RepositoryFactory;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class ProdutoBean implements Serializable {

    private Produto produto;
    private final RepositoryFactory repositoryFactory = new RepositoryFactory();

    public ProdutoBean() {
        this.produto = new Produto();
    }

    @PostConstruct
    public void init() {
        this.produto = new Produto();
    }

    public void salvar() {
        this.repositoryFactory.getProdutos().guardar(this.produto);
        this.produto = new Produto();
        
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage fm = new FacesMessage("Sucesso!", "Produto salvo.");
        context.addMessage(null, fm);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
