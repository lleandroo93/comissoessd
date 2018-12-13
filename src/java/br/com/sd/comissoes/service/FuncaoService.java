package br.com.sd.comissoes.service;

import br.com.sd.comissoes.dominio.Funcao;
import br.com.sd.comissoes.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class FuncaoService {

    private static List<Funcao> funcoes = new ArrayList<>();

    static {
        Funcao gerente = new Funcao();
        gerente.setId(1L);
        gerente.setNome("GERENTE");
        
        Funcao designer = new Funcao();
        designer.setId(2L);
        designer.setNome("DESIGNER");
        
        Funcao auxiliar = new Funcao();
        auxiliar.setId(3L);
        auxiliar.setNome("AUXILIAR");
        
        Funcao massagista = new Funcao();
        massagista.setId(3L);
        massagista.setNome("MASSAGISTA");
        
        funcoes.add(gerente);
        funcoes.add(designer);
        funcoes.add(auxiliar);
        funcoes.add(massagista);
    }
    
    public Funcao selecionarPorNome(String nome) {
        for (Funcao funcao : funcoes) {
            if (funcao.getNome().equalsIgnoreCase(nome)) {
                return funcao;
            }
        }
        return null;
    }

    public List<Funcao> listar() {
        return funcoes;
    }

    public Funcao selecionar(Long id) {
        for (Funcao funcao : funcoes) {
            if (funcao.getId().equals(id)) {
                return funcao;
            }
        }
        return null;
    }
}
