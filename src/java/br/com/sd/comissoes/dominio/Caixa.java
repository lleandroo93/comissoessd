package br.com.sd.comissoes.dominio;

import java.io.Serializable;
import java.util.Date;

public class Caixa implements Serializable{
    
    private Long id;
    private Date data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
