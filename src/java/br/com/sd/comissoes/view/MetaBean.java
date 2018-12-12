package br.com.sd.comissoes.view;

import br.com.sd.comissoes.dominio.Meta;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class MetaBean implements Serializable {
    
    private Meta meta;

    public MetaBean() {
        this.meta = new Meta();
    }

    public Meta getMeta() {
        return meta;
    }
    
    public void salvar() {
        
    }
    
}
