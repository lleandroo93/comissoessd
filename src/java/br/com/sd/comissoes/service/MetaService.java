package br.com.sd.comissoes.service;

import br.com.sd.comissoes.dominio.Meta;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MetaService {
    
    private static List<Meta> metas = new ArrayList<>();
    
    static {
        Meta meta1 = new Meta();
        meta1.setId(1l);
        meta1.setNome("META INICIAL");
        meta1.setPorcentagemComissao(new BigDecimal(10));
        meta1.setQuantidadeMinima(0);
        
        Meta meta2 = new Meta();
        meta2.setId(2l);
        meta2.setNome("META PRATA");
        meta2.setPorcentagemComissao(new BigDecimal(15));
        meta2.setQuantidadeMinima(100);
        
        Meta meta3 = new Meta();
        meta3.setId(3l);
        meta3.setNome("META OURO");
        meta3.setPorcentagemComissao(new BigDecimal(20));
        meta3.setQuantidadeMinima(200);
        
        metas.add(meta1);
        metas.add(meta2);
        metas.add(meta3);
    }
    
    public List<Meta> listar(){ 
        return metas;
    }
    
    public Meta selecionar(Long id) {
        for (Meta meta : metas) {
            if (meta.getId().equals(id)) {
                return meta;
            }
        }
        return null;
    }
    
}
