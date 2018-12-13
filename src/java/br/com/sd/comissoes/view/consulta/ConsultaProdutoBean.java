package br.com.sd.comissoes.view.consulta;

import br.com.sd.comissoes.dominio.Produto;
import br.com.sd.comissoes.util.RepositoryFactory;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ConsultaProdutoBean implements Serializable{
    
    private RepositoryFactory repositoryFactory = new RepositoryFactory();
    private List<Produto> produtos;
    private String filtro;
    
    @PostConstruct
    public void init() {
        this.produtos = repositoryFactory.getProdutos().todos();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }
    
}
