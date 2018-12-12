package br.com.sd.comissoes.bean;

import br.com.sd.comissoes.dominio.Funcionario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class FuncionarioBean implements Serializable {

    private Funcionario funcionario;

    public FuncionarioBean() {
        this.funcionario = new Funcionario();
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }
    
    public void salvar() {
        
    }

}
