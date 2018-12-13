package br.com.sd.comissoes.repository;

import br.com.sd.comissoes.dominio.Produto;
import java.util.List;

public interface Produtos {
    
    List<Produto> todos();
    Produto porID(Long id);
    void guardar(Produto produto);
    
}
