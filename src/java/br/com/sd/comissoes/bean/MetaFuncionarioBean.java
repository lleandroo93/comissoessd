package br.com.sd.comissoes.bean;

import br.com.sd.comissoes.dominio.Funcionario;
import br.com.sd.comissoes.dominio.Meta;
import br.com.sd.comissoes.dominio.MetaFuncionario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MetaFuncionarioBean implements Serializable {
    
    private List<Meta> metas;
    private Meta meta;
    private Funcionario funcionario;
    private List<MetaFuncionario> metaFuncionario;
    private MetaFuncionario metaFuncionarioSelecionada;

    public MetaFuncionarioBean() {
        this.funcionario = new Funcionario();
        this.meta = new Meta();
        this.metaFuncionario = new ArrayList<>();
        this.metas = criaMetas();
    }
    
    public List<Meta> criaMetas() {
        List<Meta> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Meta meta = new Meta();
            meta.setId((long) i+1);
            meta.setNome("META " + i+1);
            meta.setQuantidadeMinima(i * 100);
            meta.setPorcentagemComissao(new BigDecimal(10 + (i* 5)));
            
            list.add(meta);
        }
        return list;
    }
    
    public void removerDaLista() {
        this.metaFuncionario.remove(this.metaFuncionarioSelecionada);
    }
    
    public void adicionar() {
        MetaFuncionario metaFuncionario = new MetaFuncionario();
        metaFuncionario.setMeta(this.meta);
        metaFuncionario.setFuncionario(this.funcionario);
        
        this.metaFuncionario.add(metaFuncionario);
    }
    
    public void salvar () {
        
    }
    
    

    public List<MetaFuncionario> getMetaFuncionario() {
        return metaFuncionario;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
    
    public List<Meta> getMetas() {
        return metas;
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public MetaFuncionario getMetaFuncionarioSelecionada() {
        return metaFuncionarioSelecionada;
    }

    public void setMetaFuncionarioSelecionada(MetaFuncionario metaFuncionarioSelecionada) {
        this.metaFuncionarioSelecionada = metaFuncionarioSelecionada;
    }
    
}
