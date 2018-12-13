package br.com.sd.comissoes.repository.impl;

import br.com.sd.comissoes.dominio.Funcao;
import br.com.sd.comissoes.repository.Funcoes;
import java.util.List;
import org.hibernate.Session;

public class FuncoesImpl implements Funcoes{
    
    private final Session session;

    public FuncoesImpl(Session session) {
        this.session = session;
    }

    @Override
    public List<Funcao> todas() {
        return session.createCriteria(Funcao.class).list();
    }

    @Override
    public Funcao porID(Long id) {
        return (Funcao) session.get(Funcao.class, id);
    }
    
}
