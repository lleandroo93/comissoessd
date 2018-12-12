package br.com.sd.comissoes.view;

import br.com.sd.comissoes.dominio.*;
import br.com.sd.comissoes.service.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MetaFuncionarioBean implements Serializable {
    
    private List<Meta> metas;
    private List<Funcionario> funcionarios;
    
    private Meta meta;
    private Funcionario funcionario;
    private List<MetaFuncionario> metaFuncionario;
    private MetaFuncionario metaFuncionarioSelecionada;

    public MetaFuncionarioBean() {
        this.metaFuncionario = new ArrayList<>();
        
        this.metas = new MetaService().listar();
        this.funcionarios = new FuncionarioService().listar();
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
        MetaFuncionarioService metaFuncionarioService = new MetaFuncionarioService();
        metaFuncionarioService.salvar(metaFuncionario);
        
        this.meta = null;
        this.funcionario = null;
        this.metaFuncionario.clear();
        this.metaFuncionarioSelecionada = null;
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

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public MetaFuncionario getMetaFuncionarioSelecionada() {
        return metaFuncionarioSelecionada;
    }

    public void setMetaFuncionarioSelecionada(MetaFuncionario metaFuncionarioSelecionada) {
        this.metaFuncionarioSelecionada = metaFuncionarioSelecionada;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    
    
}
