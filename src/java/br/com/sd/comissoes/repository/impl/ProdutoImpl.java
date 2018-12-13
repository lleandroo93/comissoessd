package br.com.sd.comissoes.repository.impl;

import br.com.sd.comissoes.dominio.Produto;
import br.com.sd.comissoes.repository.Produtos;
import java.util.List;
import org.hibernate.Session;

public class ProdutoImpl implements Produtos {
    
    private final Session session;

    public ProdutoImpl(Session session) {
        this.session = session;
    }
    
    @Override
    public List<Produto> todos() {
        return session.createCriteria(Produto.class).list();
    }

    @Override
    public Produto porID(Long id) {
        return (Produto) session.get(Produto.class, id);
    }

    @Override
    public void guardar(Produto produto) {
        session.merge(produto);
    }
    
}
