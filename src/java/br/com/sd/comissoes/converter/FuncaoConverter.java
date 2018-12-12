package br.com.sd.comissoes.converter;

import br.com.sd.comissoes.dominio.Funcao;
import br.com.sd.comissoes.service.FuncaoService;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(forClass = Funcao.class)
public class FuncaoConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null) {
            return null;
        }
        return new FuncaoService().selecionar(Long.parseLong(string));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return String.valueOf(((Funcao)o).getId());
    }
    
}
