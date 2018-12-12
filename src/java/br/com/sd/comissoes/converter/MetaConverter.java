package br.com.sd.comissoes.converter;

import br.com.sd.comissoes.dominio.Meta;
import br.com.sd.comissoes.service.MetaService;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Meta.class)
public class MetaConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string != null && !string.isEmpty()) {
            Long id = Long.valueOf(string);
            return new MetaService().selecionar(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Meta meta = (Meta) o;
        if (meta == null) {
            return null;
        } else {
            return String.valueOf(meta.getId());
        }
    }
    
}
