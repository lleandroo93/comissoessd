package br.com.sd.comissoes.dominio;

import java.io.Serializable;

public class MetaFuncao implements Serializable {

    private Meta meta;
    private Funcao funcao;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

}
