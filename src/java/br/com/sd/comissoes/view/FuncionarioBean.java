package br.com.sd.comissoes.view;

import br.com.sd.comissoes.dominio.Funcionario;
import br.com.sd.comissoes.dominio.Funcao;
import br.com.sd.comissoes.service.FuncaoService;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class FuncionarioBean implements Serializable {

    private Funcionario funcionario;
    private List<Funcao> funcoes;

    public FuncionarioBean() {
        this.funcionario = new Funcionario();
        this.funcoes = new FuncaoService().listar();
    }
    
    public void salvar() {
        
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public List<Funcao> getFuncoes() {
        return funcoes;
    }

}
