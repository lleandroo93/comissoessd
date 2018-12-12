package br.com.sd.comissoes.dominio;

import java.io.Serializable;

public class MetaFuncionario implements Serializable {

    private Meta meta;
    private Funcionario funcionario;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
