package br.com.sd.comissoes.repository.impl;

import br.com.sd.comissoes.dominio.Meta;
import br.com.sd.comissoes.repository.Metas;
import java.util.List;
import org.hibernate.Session;

public class MetasImpl implements Metas{
    
    private final Session session;

    public MetasImpl(Session session) {
        this.session = session;
    }
    
    @Override
    public List<Meta> todas() {
        return session.createCriteria(Meta.class).list();
    }

    @Override
    public Meta porID(Long id) {
        return (Meta) session.get(Meta.class, id);
    }
    
}
