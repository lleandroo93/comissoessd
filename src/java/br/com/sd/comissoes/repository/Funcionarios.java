package br.com.sd.comissoes.repository;

import br.com.sd.comissoes.dominio.Funcionario;
import java.util.List;

public interface Funcionarios {

    List<Funcionario> todos();
    Funcionario porID(Long id);
    void guardar(Funcionario funcionario);
    
}
