package br.com.sd.comissoes.view;

import br.com.sd.comissoes.dominio.Funcionario;
import br.com.sd.comissoes.dominio.Funcao;
import br.com.sd.comissoes.util.RepositoryFactory;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class FuncionarioBean implements Serializable {

    private List<Funcao> funcoes;
    
    private Funcionario funcionario;
    private final RepositoryFactory repositoryFactory = new RepositoryFactory();

    @PostConstruct
    public void init() {
        this.funcoes = this.repositoryFactory.getFuncoes().todas();
        this.funcionario = new Funcionario();
    }

    public void salvar() {
        this.repositoryFactory.getFuncionarios().guardar(this.funcionario);
        this.funcionario = new Funcionario();
        
        String msg = "Funcionário cadastrado!";
        FacesContext.getCurrentInstance().addMessage(msg, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", msg));
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public List<Funcao> getFuncoes() {
        return funcoes;
    }
    
}
