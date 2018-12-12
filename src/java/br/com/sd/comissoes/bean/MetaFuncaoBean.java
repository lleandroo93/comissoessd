package br.com.sd.comissoes.bean;

import br.com.sd.comissoes.dominio.Funcao;
import br.com.sd.comissoes.dominio.Meta;
import br.com.sd.comissoes.dominio.MetaFuncao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class MetaFuncaoBean implements Serializable {
    
    private Meta meta;
    private Funcao funcao;
    private List<MetaFuncao> metaFuncao;

    public MetaFuncaoBean() {
    }

    public List<MetaFuncao> getMetaFuncao() {
        return metaFuncao;
    }

    public Meta getMeta() {
        return meta;
    }

    public Funcao getFuncao() {
        return funcao;
    }
    
    public void salvar () {
        
    }
}
