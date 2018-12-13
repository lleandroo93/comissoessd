package br.com.sd.comissoes.repository.impl;

import br.com.sd.comissoes.dominio.Funcionario;
import br.com.sd.comissoes.repository.Funcionarios;
import java.util.List;
import org.hibernate.Session;

public class FuncionariosImpl implements Funcionarios {

    private final Session session;

    public FuncionariosImpl(Session session) {
        this.session = session;
    }
    
    @Override
    public List<Funcionario> todos() {
        return session.createCriteria(Funcionario.class).list();
    }

    @Override
    public Funcionario porID(Long id) {
        return (Funcionario) session.get(Funcionario.class, id);
    }

    @Override
    public void guardar(Funcionario funcionario) {
        session.merge(funcionario);
    }
    
}
