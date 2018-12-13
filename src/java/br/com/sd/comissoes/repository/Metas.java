package br.com.sd.comissoes.repository;

import br.com.sd.comissoes.dominio.Meta;
import java.util.List;

public interface Metas {
    
    List<Meta> todas();
    Meta porID(Long id);
}
