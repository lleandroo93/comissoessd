package br.com.sd.comissoes.view.consulta;

import br.com.sd.comissoes.dominio.Funcionario;
import br.com.sd.comissoes.util.RepositoryFactory;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ConsultaFuncionarioBean implements Serializable{
    
    private List<Funcionario> funcionarios;
    private String filtro;
    private final RepositoryFactory repositoryFactory = new RepositoryFactory();
    
    @PostConstruct
    public void init() {
        this.funcionarios = repositoryFactory.getFuncionarios().todos();
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }
    
}
