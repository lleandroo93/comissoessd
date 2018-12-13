package br.com.sd.comissoes.converter;

import br.com.sd.comissoes.dominio.Meta;
import br.com.sd.comissoes.util.RepositoryFactory;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Meta.class)
public class MetaConverter implements Converter{
    
    private final RepositoryFactory repositoryFactory = new RepositoryFactory();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null) {
            return null; 
        }
        return this.repositoryFactory.getMetas().porID(Long.parseLong(string));
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
