package br.com.sd.comissoes.converter;

import br.com.sd.comissoes.dominio.Funcionario;
import br.com.sd.comissoes.service.FuncionarioService;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Funcionario.class)
public class FuncionarioConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null) {
            return null;
        }
        return new FuncionarioService().selecionar(Long.parseLong(string));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return String.valueOf(((Funcionario)o).getId());
    }
    
}
