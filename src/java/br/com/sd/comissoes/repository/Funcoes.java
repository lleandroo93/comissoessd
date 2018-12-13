package br.com.sd.comissoes.repository;

import br.com.sd.comissoes.dominio.Funcao;
import java.util.List;

public interface Funcoes {
    
    List<Funcao> todas();
    Funcao porID(Long id);
    
}
