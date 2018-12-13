package br.com.sd.comissoes.util;

import br.com.sd.comissoes.repository.*;
import br.com.sd.comissoes.repository.impl.*;
import java.io.Serializable;
import org.hibernate.Session;

public class RepositoryFactory implements Serializable {

    private Session getSession() {
        return (Session) FacesUtil.getRequestAttribute("session");
    }
    
    public Funcoes getFuncoes() {
        return new FuncoesImpl(getSession());
    }

    public Funcionarios getFuncionarios() {
        return new FuncionariosImpl(getSession());
    }

    public Metas getMetas() {
        return new MetasImpl(getSession());
    }

    public Produtos getProdutos() {
        return new ProdutoImpl(getSession());
    }

}
