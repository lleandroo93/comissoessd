package br.com.sd.comissoes.converter;

import br.com.sd.comissoes.dominio.Funcao;
import br.com.sd.comissoes.util.RepositoryFactory;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(forClass = Funcao.class)
public class FuncaoConverter implements Converter{
    
    private final RepositoryFactory repositoryFactory = new RepositoryFactory();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null) {
            return null;
        }
        return this.repositoryFactory.getFuncoes().porID(Long.parseLong(string));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return String.valueOf(((Funcao)o).getId());
    }
    
}
